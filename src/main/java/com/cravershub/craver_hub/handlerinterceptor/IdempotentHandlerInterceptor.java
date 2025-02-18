package com.cravershub.craver_hub.handlerinterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class IdempotentHandlerInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestMethod = request.getMethod();
        String x_request_id = request.getHeader("X-Request-ID");
        switch (requestMethod) {
            case "POST":
                // TODO: This condition needs to be their own method
                if (x_request_id == null) {
                    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                    return false;
                }
                else
                {
                    //TODO : Do Redis Read and Write and Check for already existing key
                }
                case "PUT":
                    if (x_request_id == null) {
                        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                        return false;
                    }
                    else
                    {
                        //TODO : Do Redis Read and Write and Check for already existing key
                    }
                    case "DELETE":
                        if (x_request_id == null) {
                            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                            return false;
                        }
                        else
                        {
                            //TODO : Do Redis Read and Write and Check for already existing key
                        }
            default:
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
