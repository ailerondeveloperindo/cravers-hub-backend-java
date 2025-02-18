package com.cravershub.craver_hub.controller;

import com.cravershub.craver_hub.dto.Jsend;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TestControllerHandlerException extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex, WebRequest request) {
        Jsend response = new Jsend("error", ex.getMessage(), null);
        return new ResponseEntity<>( response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> GeneralExceptionHandler(Exception ex, WebRequest request) {
        Jsend response = new Jsend("error", "Internal Server Error", null);
        return new ResponseEntity<>( response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
