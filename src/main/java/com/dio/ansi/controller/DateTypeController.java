package com.dio.ansi.controller;

import com.dio.ansi.model.DateType;
import com.dio.ansi.service.DateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/datetype")
public class DateTypeController {

    @Autowired
    DateTypeService dateTypeService;

    @PostMapping
    public DateType createDateType(@RequestBody DateType dateType) {
        return dateTypeService.createDateType(dateType);
    }

    @DeleteMapping("/{idDateType}")
    public void deleteDateType(@PathVariable("idDateType") Long idDateType) {
        dateTypeService.deleteDateType(idDateType);
    }

    @GetMapping("/{idDateType}")
    public DateType findById(@PathVariable("idDateType") Long idDateType) {
        return dateTypeService.findById(idDateType);
    }

    @GetMapping
    public List<DateType> findAll() {
        return dateTypeService.findAll();
    }

    @PutMapping
    public DateType updateDateType(@RequestBody DateType dateType) {
        return dateTypeService.createDateType(dateType);
    }
}
