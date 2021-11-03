package com.dio.ansi.service;

import com.dio.ansi.exception.CompTimeNotFoundException;
import com.dio.ansi.model.CompTime;
import com.dio.ansi.repository.CompTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompTimeService {

    CompTimeRepository compTimeRepository;

    @Autowired
    public CompTimeService(CompTimeRepository compTimeRepository) {
        this.compTimeRepository = compTimeRepository;
    }

    public CompTime createCompTime(CompTime compTime) {
        return compTimeRepository.save(compTime);
    }

    public void deleteCompTime(Long idCompTime) {
        compTimeRepository.deleteById(idCompTime);
    }

    public List<CompTime> findAll(){
        return compTimeRepository.findAll();
    }

    public CompTime getById(Long compTimeId){
        return compTimeRepository.findById(compTimeId).orElseThrow(() -> new CompTimeNotFoundException(compTimeId));
    }

    public CompTime updateCompTime(CompTime compTime) {
        return compTimeRepository.save(compTime);
    }

}
