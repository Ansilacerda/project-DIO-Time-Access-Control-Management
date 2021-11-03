package com.dio.ansi.controller;

import com.dio.ansi.model.WorkingJourney;
import com.dio.ansi.service.WorkingJourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/journey")
public class WorkingJourneyController {
    @Autowired
    WorkingJourneyService journeyService;

    @PostMapping
    public WorkingJourney createJourney(@RequestBody WorkingJourney workingJourney){
        return journeyService.createJourney(workingJourney);
    }

    @DeleteMapping("/{idJourney}")
    public void deleteJourneyById(@PathVariable("idJourney") Long idJourney) {
        journeyService.deleteJourney(idJourney);
    }

    @GetMapping("/{idJourney}")
    public WorkingJourney findById(@PathVariable("idJourney") Long idJourney) {
        return journeyService.findById(idJourney);
    }

    @GetMapping
    public List<WorkingJourney> findAll(){
        return journeyService.findAll();
    }

    @PutMapping
    public WorkingJourney updateJourney(@RequestBody WorkingJourney workingJourney){
        return journeyService.updateJourney(workingJourney);
    }
}