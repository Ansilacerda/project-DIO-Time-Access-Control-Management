package com.dio.ansi.controller;

import com.dio.ansi.model.Calendar;
import com.dio.ansi.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Autowired
    CalendarService calendarService;

    @PostMapping
    public Calendar createCalendar(@RequestBody Calendar calendar) {
        return calendarService.createCalendar(calendar);
    }

    @DeleteMapping("/{idCalendar}")
    public void deleteCalendar(@PathVariable Long idCalendar){
        calendarService.deleteCalendar(idCalendar);
    }

    @GetMapping("/{idCalendar}")
    public Calendar findById(@PathVariable ("idCalendar") Long idCalendar) {
        return calendarService.findById(idCalendar);
    }

    @GetMapping
    public List<Calendar> findAll() {
        return calendarService.findAll();
    }

    @PutMapping
    public Calendar updateCalendar(@RequestBody Calendar calendar) {
        return calendarService.updateCalendar(calendar);
    }

}
