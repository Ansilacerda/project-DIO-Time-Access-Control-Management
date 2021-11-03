package com.dio.ansi.controller;

import com.dio.ansi.exception.OccurrenceNotFoundException;
import com.dio.ansi.model.Occurrence;
import com.dio.ansi.service.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/occurrence")
public class OccurrenceController {

    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence) {
        return occurrenceService.createOccurrence(occurrence);
    }

    @DeleteMapping
    public void deleteOccurrence(@PathVariable("idOccurrence") Long idOccurrence) {
        occurrenceService.deleteOccurrence(idOccurrence);
    }

    @GetMapping("/{idOccurrence}")
    public Occurrence findById(Long idOccurrence) {
        return occurrenceService.findById(idOccurrence);
    }

    @GetMapping
    public List<Occurrence> findAll() {
        return occurrenceService.findAll();
    }

    @PutMapping
    public Occurrence updateOccurrence(Occurrence occurrence) {
        return occurrenceService.createOccurrence(occurrence);
    }
}
