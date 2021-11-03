package com.dio.ansi.service;

import com.dio.ansi.exception.CalendarNotFoundException;
import com.dio.ansi.model.Calendar;
import com.dio.ansi.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CalendarService {

    CalendarRepository calendarRepository;

    @Autowired
    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public Calendar createCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    public void deleteCalendar(Long idCalendar) {
        calendarRepository.deleteById(idCalendar);
    }

    public List<Calendar> findAll() {
        return calendarRepository.findAll();
    }

    public Calendar findById(Long idCalendar){
        return calendarRepository.findById(idCalendar).orElseThrow(()-> new CalendarNotFoundException(idCalendar));
    }

    public Calendar updateCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }
}
