package com.sumanth.placementportal.controller;

import com.sumanth.placementportal.entity.Company;
import com.sumanth.placementportal.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // Get all companies
    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    // Get company by ID
    @GetMapping("/companies/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }

    // Add new company
    @PostMapping("/companies")
    public Company addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    // Update company
    @PutMapping("/companies/{id}")
    public Company updateCompany(@PathVariable Long id,
                                 @RequestBody Company company) {
        return companyService.updateCompany(id, company);
    }

    // Delete company
    @DeleteMapping("/companies/{id}")
    public String deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
        return "Company deleted successfully!";
    }
}