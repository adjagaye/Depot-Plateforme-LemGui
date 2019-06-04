package com.lemgui.securite;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lemgui.entities.Membre;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.security.Key;
import java.util.Date;

public class JWTAuthentificationFilter extends UsernamePasswordAuthenticationFilter {
    private AuthenticationManager authenticationManager;



    public JWTAuthentificationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        Membre membre = null;
        try {
            membre = new ObjectMapper().readValue(request.getInputStream(), Membre.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(" *************************");
        System.out.println("login"+membre.getLogin());
        System.out.println("password"+membre.getMdp());
        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(membre.getLogin(),membre.getMdp()));
    }


    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        User springUser = (User) authResult.getPrincipal();
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        // Secret key
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SecurityConstant.SECRET);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());


        String jwt = Jwts.builder()
                .setSubject(springUser.getUsername())
                .setExpiration(new Date(System.currentTimeMillis()+SecurityConstant.EXPIRATION_TIME))
                .signWith(signingKey,signatureAlgorithm)
                .claim("roles", springUser.getAuthorities())
                .compact();
        response.addHeader(SecurityConstant.HEADER_STRING,SecurityConstant.TOKEN_PREFIX+jwt);
    }
}
