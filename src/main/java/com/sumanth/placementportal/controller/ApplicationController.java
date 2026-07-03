package com.sumanth.placementportal.controller;

import com.sumanth.placementportal.entity.Application;
import com.sumanth.placementportal.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/applications")
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/applications/{id}")
    public Application getApplicationById(@PathVariable Long id) {
        return applicationService.getApplicationById(id);
    }

    @PostMapping("/applications")
    public Application addApplication(
            @RequestBody Application application) {
        return applicationService.saveApplication(application);
    }

    @PutMapping("/applications/{id}")
    public Application updateApplication(
            @PathVariable Long id,
            @RequestBody Application application) {

        return applicationService.updateApplication(id, application);
    }

    @DeleteMapping("/applications/{id}")
    public String deleteApplication(@PathVariable Long id) {

        applicationService.deleteApplication(id);

        return "Application Deleted Successfully";
    }
}