package com.dio.ansi.service;

import com.dio.ansi.exception.WorkingJourneyNotFoundException;
import com.dio.ansi.model.WorkingJourney;
import com.dio.ansi.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkingJourneyService {

    JourneyRepository journeyRepository;

    @Autowired
    public WorkingJourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkingJourney createJourney(WorkingJourney workingJourney) {
        return journeyRepository.save(workingJourney);
    }

    public void deleteJourney(Long idJourney) {
        journeyRepository.deleteById(idJourney);
    }

    public List<WorkingJourney> findAll() {
        return journeyRepository.findAll();
    }

    public WorkingJourney findById(Long idJourney) {
        return journeyRepository.findById(idJourney).orElseThrow(()-> new WorkingJourneyNotFoundException(idJourney));
    }

    public WorkingJourney updateJourney(WorkingJourney workingJourney){
        return journeyRepository.save(workingJourney);
    }
}