package com.cravershub.craver_hub.filter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.cravershub.craver_hub.dto.Jsend;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JWTValidationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String authHeader = request.getHeader("Authorization");
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                authHeader = authHeader.substring(7);
                Algorithm algorithm = Algorithm.RSA256(null,null);
                JWTVerifier verifier = JWT.require(algorithm).withIssuer(request.getRequestURI()).build();
                verifier.verify(authHeader);
            }
            else {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            }
        } catch (JWTVerificationException e)
        {
            Jsend responseBody = new Jsend("error",e.getMessage(),null);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write(responseBody.toString());
        }

    }
}
