package com.dio.ansi.exception;

public class CompTimeNotFoundException extends RuntimeException {
    public CompTimeNotFoundException(Long idCompTime) {
        super("Could not found Comp Time"+idCompTime);
    }
 }
