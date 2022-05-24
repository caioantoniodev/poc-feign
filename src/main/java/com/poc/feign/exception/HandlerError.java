package com.poc.feign.exception;

import feign.FeignException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class HandlerError {

    @ExceptionHandler(FeignException.class)
    public ErrorDetails handleFeignStatusException(FeignException e, HttpServletRequest http) {

        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(e.getLocalizedMessage());
        errorDetails.setStatus(e.status());
        errorDetails.setPath(http.getRequestURI());

        return errorDetails;
    }
}
