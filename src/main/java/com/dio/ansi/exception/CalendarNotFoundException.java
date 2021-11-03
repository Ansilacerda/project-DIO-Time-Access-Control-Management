package com.dio.ansi.exception;

public class CalendarNotFoundException extends RuntimeException{
    public CalendarNotFoundException(Long idCalendar){
        super("Could not found this Calendar" +idCalendar);
    }
}
