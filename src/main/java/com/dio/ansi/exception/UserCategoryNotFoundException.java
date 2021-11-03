package com.dio.ansi.exception;

public class UserCategoryNotFoundException extends RuntimeException {
    public UserCategoryNotFoundException(Long idUserCategory) {
        super("Could not found User Category"+idUserCategory);
    }
}
