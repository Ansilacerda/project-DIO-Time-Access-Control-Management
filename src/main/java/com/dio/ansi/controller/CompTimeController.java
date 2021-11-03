package com.dio.ansi.controller;

import com.dio.ansi.model.CompTime;
import com.dio.ansi.service.CompTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comptime")
public class CompTimeController {

    @Autowired
    CompTimeService compTimeService;

    @PostMapping
    public CompTime createCompTime(@RequestBody CompTime compTime) {
        return compTime;
    }
}
