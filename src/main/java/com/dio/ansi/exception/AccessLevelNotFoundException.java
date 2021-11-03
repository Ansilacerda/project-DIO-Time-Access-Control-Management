package com.dio.ansi.exception;

public class AccessLevelNotFoundException extends RuntimeException {
    public AccessLevelNotFoundException (Long idAccessLevel) {
        super("Could not found this Access Level" +idAccessLevel);
    }
}
