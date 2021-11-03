package com.dio.ansi.exception;

public class MovementNotFoundException extends RuntimeException{
    public MovementNotFoundException(Long idMovement) {
        super("Could not found Movement"+idMovement);
    }
}
