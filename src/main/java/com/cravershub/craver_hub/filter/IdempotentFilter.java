package com.cravershub.craver_hub.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;
import redis.clients.jedis.UnifiedJedis;

import java.io.IOException;

public class IdempotentFilter extends OncePerRequestFilter {

    private void getIdempotentKey()
    {
        //TODO: Separate Bean - Component etc - connection instance must be singleton
        UnifiedJedis jedis = new UnifiedJedis("redis://localhost:6379");
        jedis.get("getIdempotentKey");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestMethod = request.getMethod();
        String x_request_id = request.getHeader("X-Request-ID");
        getIdempotentKey();
        switch (requestMethod) {
            case "POST":
                // TODO: This condition needs to be their own method
                if (x_request_id == null) {
                    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    filterChain.doFilter(request, response);
                    return;
                }
                else
                {
                    //TODO : Do Redis Read and Write and Check for already existing key
                }
            case "PUT":
                if (x_request_id == null) {
                    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    filterChain.doFilter(request, response);
                    return;
                }
                else
                {
                    //TODO : Do Redis Read and Write and Check for already existing key
                }
            case "DELETE":
                if (x_request_id == null) {
                    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    return;
                }
                else
                {
                    //TODO : Do Redis Read and Write and Check for already existing key
                }
            default:
                filterChain.doFilter(request, response);
        }
    }
}
