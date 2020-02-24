package com.practise.demo.config;

import com.practise.demo.shared.exceptions.EntityNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<Object> handleException(EntityNotFoundException ex, WebRequest request) {
        return handleExceptionInternal(
                ex,
                ex.getError().getMessage(),
                new HttpHeaders(),
                HttpStatus.UNPROCESSABLE_ENTITY, request
        );
    }
}

