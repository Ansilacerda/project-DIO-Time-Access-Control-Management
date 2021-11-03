package com.dio.ansi.service;

import com.dio.ansi.exception.OccurrenceNotFoundException;
import com.dio.ansi.model.Occurrence;
import com.dio.ansi.repository.OccurrenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OccurrenceService {

    OccurrenceRepository occurrenceRepository;

    @Autowired
    public OccurrenceService(OccurrenceRepository occurrenceRepository) {
        this.occurrenceRepository = occurrenceRepository;
    }

    public Occurrence createOccurrence(Occurrence occurrence) {
        return occurrenceRepository.save(occurrence);
    }

    public void deleteOccurrence(Long idOccurrence) {
        occurrenceRepository.deleteById(idOccurrence);
    }

    public Occurrence findById(Long idOccurrence) {
        return occurrenceRepository.findById(idOccurrence).orElseThrow(() -> new OccurrenceNotFoundException(idOccurrence));
    }

    public List<Occurrence> findAll() {
        return occurrenceRepository.findAll();
    }

    public Occurrence updateOccurrence(Occurrence occurrence) {
        return occurrenceRepository.save(occurrence);
    }
}
