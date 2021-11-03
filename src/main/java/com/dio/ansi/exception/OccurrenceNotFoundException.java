package com.dio.ansi.exception;

public class OccurrenceNotFoundException extends RuntimeException {
    public OccurrenceNotFoundException(Long idOccurrence) {
        super("Could not found Occurrence"+idOccurrence);
    }
}
