package com.recap.springboot.rresttemplate.exception;

public class DefaultExceptionHandler extends RuntimeException{
    public DefaultExceptionHandler(String message) {
        super(message);
    }
}
