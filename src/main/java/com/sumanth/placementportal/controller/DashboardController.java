package com.sumanth.placementportal.controller;

import com.sumanth.placementportal.dto.DashboardDTO;
import com.sumanth.placementportal.repository.ApplicationRepository;
import com.sumanth.placementportal.repository.CompanyRepository;
import com.sumanth.placementportal.repository.PlacementDriveRepository;
import com.sumanth.placementportal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PlacementDriveRepository placementDriveRepository;

    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping("/dashboard")
    public DashboardDTO getDashboard() {

        return new DashboardDTO(
                studentRepository.count(),
                companyRepository.count(),
                placementDriveRepository.count(),
                applicationRepository.count()
        );
    }
}