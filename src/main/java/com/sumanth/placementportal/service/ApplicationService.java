package com.sumanth.placementportal.service;

import com.sumanth.placementportal.entity.Application;
import com.sumanth.placementportal.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public Application updateApplication(Long id, Application updatedApplication) {

        Application application =
                applicationRepository.findById(id).orElse(null);

        if(application != null) {

            application.setStudentId(updatedApplication.getStudentId());
            application.setDriveId(updatedApplication.getDriveId());
            application.setApplicationStatus(
                    updatedApplication.getApplicationStatus());

            return applicationRepository.save(application);
        }

        return null;
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}