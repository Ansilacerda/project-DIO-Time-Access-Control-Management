package com.dio.ansi.exception;

public class WorkingJourneyNotFoundException extends RuntimeException{
    public WorkingJourneyNotFoundException(Long idJourney) {
        super("Could not found Working Journey" +idJourney);
    }
}
