package com.cravershub.craver_hub.filter;

import com.auth0.jwk.JwkException;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.JwkProviderBuilder;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.RSAKeyProvider;
import com.cravershub.craver_hub.dto.Jsend;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.concurrent.TimeUnit;

public class JWTValidationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String authHeader = request.getHeader("Authorization");
            JwkProvider provider = new JwkProviderBuilder("https://dev-0ffhc1bmak2bqurs.us.auth0.com/")
                    // up to 10 JWKs will be cached for up to 24 hours
                    .cached(10, 24, TimeUnit.HOURS)
                    // up to 10 JWKs can be retrieved within one minute
                    .rateLimited(10, 1, TimeUnit.MINUTES)
                    .build();
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                authHeader = authHeader.substring(7);
                RSAKeyProvider keyProvider = new RSAKeyProvider() {
                    @Override
                    public RSAPublicKey getPublicKeyById(String s) {
                        try {
                            return (RSAPublicKey) provider.get(s).getPublicKey();
                        } catch (JwkException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    @Override
                    public RSAPrivateKey getPrivateKey() {
                        return null;
                    }

                    @Override
                    public String getPrivateKeyId() {
                        return "";
                    }
                };


                Algorithm algorithm = Algorithm.RSA256(keyProvider);
                JWTVerifier verifier = JWT.require(algorithm).withIssuer("https://dev-0ffhc1bmak2bqurs.us.auth0.com/").build();
                verifier.verify(authHeader);
            }
            else {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            }
        }catch (Exception e)
        {
            Jsend responseBody = new Jsend("error",e.getMessage(),null);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{tes}");
        }

    }
}
