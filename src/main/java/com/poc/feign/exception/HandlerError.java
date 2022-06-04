package com.poc.feign.exception;

import feign.FeignException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestControllerAdvice
public class HandlerError {

    @ExceptionHandler(FeignException.class)
    public Map<String, Object> handleFeignStatusException(FeignException e, HttpServletResponse http) {

        http.setStatus(e.status());

        return new JSONObject(e.contentUTF8()).toMap();
    }
}
