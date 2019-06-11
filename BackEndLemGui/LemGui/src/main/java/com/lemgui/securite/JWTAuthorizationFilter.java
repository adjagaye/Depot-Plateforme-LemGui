package com.lemgui.securite;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class JWTAuthorizationFilter extends OncePerRequestFilter {
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
        if(request.getMethod().equals("OPTIONS")){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            if(jwt == null || !jwt.startsWith(SecurityConstant.TOKEN_PREFIX)){
                filterchain.doFilter(request,response);
                return;
            }

            Claims claims = Jwts.parser()
                    .setSigningKey(SecurityConstant.SECRET)
                    .parseClaimsJws(jwt.replace(SecurityConstant.TOKEN_PREFIX,""))
                    .getBody();
            String username = claims.getSubject();
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
