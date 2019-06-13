package com.lemgui.securite;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class JWTAuthorizationFilter extends OncePerRequestFilter {
    SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
    @Override
    protected void  doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterchain) throws ServletException, IOException {
       response.addHeader("Access-Control-Allow-Origin","*");
       response.addHeader("Access-Control-Allow-Headers",
               "Origin, Accept, X-Requested-With, Content-Type," +
                       "Access-Control-Request-Method," +
                       "Access-Control-Request-Headers," +
                       "Authorization");
       response.addHeader("Access-Control-Expose-Headers",
               "Access-Control-Allow-Origin" +
                       "Access-Control-Allow-Credentials," +
                       "Authorization");

        String jwt = request.getHeader(SecurityConstant.HEADER_STRING);
        System.out.println(jwt);

        if(request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            System.out.println(jwt+"aaaaaaaaaaaaaaaaaaa");
            if((jwt == null) || !jwt.startsWith(SecurityConstant.TOKEN_PREFIX)){
                filterchain.doFilter(request,response);
                return;
            }

            System.out.println("***********************");
            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SecurityConstant.SECRET);
            Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

            Claims claims = Jwts.parser()
                    .setSigningKey(signingKey)
                    .parseClaimsJws(jwt.replace(SecurityConstant.TOKEN_PREFIX,""))
                    .getBody();
            System.out.println(jwt+"aaaaaaaaaaaaaaaaaaa");
            String username = claims.getSubject();
            System.out.println(username);
            ArrayList<Map<String,String>> roles = (ArrayList<Map<String, String>>) claims.get("roles");
            Collection<GrantedAuthority> authorities = new ArrayList<>();

            for (Map<String, String> r : roles) {
                authorities.add(new SimpleGrantedAuthority(r.get("authority")));
            }
            UsernamePasswordAuthenticationToken authenticationUser=new  UsernamePasswordAuthenticationToken(username,null,authorities);
            SecurityContextHolder.getContext().setAuthentication(authenticationUser);
            filterchain.doFilter(request,response);

        }


    }
}
