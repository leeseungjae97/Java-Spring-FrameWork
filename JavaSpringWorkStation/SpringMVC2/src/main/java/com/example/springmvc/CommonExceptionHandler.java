package com.example.springmvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.example.springmvc")
public class CommonExceptionHandler {
    @ExceptionHandler(ArithmeticException.class) 
    public String handleArtimeticException() {
        return "runtimeError";
    }
}