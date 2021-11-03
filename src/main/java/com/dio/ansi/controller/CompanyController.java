package com.dio.ansi.controller;

import com.dio.ansi.exception.CompanyNotFoundException;
import com.dio.ansi.model.Company;
import com.dio.ansi.service.CompanyService;
import org.hibernate.envers.Audited;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Audited
    CompanyService companyService;

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @DeleteMapping("/{idCompany}")
    public void deleteCompany(@PathVariable("idCompany") Long idCompany) {
        companyService.deleteCompany(idCompany);
    }

    @GetMapping("/idCompany")
    public Company findById(@PathVariable("idCompany") Long idCompany) {
        return companyService.findById(idCompany);
    }

    @GetMapping
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }
}
