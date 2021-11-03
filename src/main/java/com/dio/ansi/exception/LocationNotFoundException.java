package com.dio.ansi.exception;

public class LocationNotFoundException extends RuntimeException{
    public LocationNotFoundException(Long idLocation) {
        super("Could not found Location" +idLocation);
    }
}
