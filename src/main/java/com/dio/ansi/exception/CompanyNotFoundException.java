package com.dio.ansi.exception;

public class CompanyNotFoundException extends RuntimeException{
    public CompanyNotFoundException(Long idCompany) {
        super("Could not found this Company" +idCompany);
    }
}
