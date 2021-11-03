package com.dio.ansi.service;

import com.dio.ansi.exception.DateTypeNotFoundException;
import com.dio.ansi.model.DateType;
import com.dio.ansi.repository.DateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DateTypeService {

    DateTypeRepository dateTypeRepository;

    @Autowired
    public DateTypeService(DateTypeRepository dateTypeRepository) {
        this.dateTypeRepository = dateTypeRepository;
    }

    public DateType createDateType(DateType dateType) {
        return dateTypeRepository.save(dateType);
    }

    public void deleteDateType(Long idDateType) {
        dateTypeRepository.deleteById(idDateType);
    }

    public DateType findById(Long idDateType) {
        return dateTypeRepository.findById(idDateType).orElseThrow(() -> new DateTypeNotFoundException(idDateType));
    }

    public List<DateType> findAll() {
        return dateTypeRepository.findAll();
    }

    public DateType updateDateType(DateType dateType) {
        return dateTypeRepository.save(dateType);
    }
}
