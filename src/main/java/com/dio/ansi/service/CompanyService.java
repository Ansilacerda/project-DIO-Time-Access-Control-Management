package com.dio.ansi.service;

import com.dio.ansi.exception.CompanyNotFoundException;
import com.dio.ansi.model.Company;
import com.dio.ansi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CompanyService {

    CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company) {
       return companyRepository.save(company);
    }

    public void deleteCompany(Long idCompany) {
        companyRepository.deleteById(idCompany);
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company findById(Long idCompany){
        return companyRepository.findById(idCompany).orElseThrow(() -> new CompanyNotFoundException(idCompany));
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
}
