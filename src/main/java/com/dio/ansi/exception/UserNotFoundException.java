package com.dio.ansi.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long idUser) {
        super("Could not found User"+idUser);
    }
}
