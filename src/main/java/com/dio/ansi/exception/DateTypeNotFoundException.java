package com.dio.ansi.exception;

public class DateTypeNotFoundException extends RuntimeException {
    public DateTypeNotFoundException(Long idDateType) {
        super("Could not found Date Type"+idDateType);
    }
}
