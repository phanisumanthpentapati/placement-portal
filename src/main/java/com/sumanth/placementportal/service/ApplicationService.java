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

    @Autowired
    private EmailService emailService;

    @Autowired
    private NotificationService notificationService;

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public List<Application> getApplicationsByStudentId(Long studentId) {
        return applicationRepository.findByStudentId(studentId);
    }

    public Application saveApplication(Application application) {

        // Save application
        Application savedApplication =
                applicationRepository.save(application);

        // Send email notification
        emailService.sendSelectionMail(application.getEmail());

        // Save in-app notification
        notificationService.createNotification(
                application.getStudentId(),
                "Application Submitted",
                "Your application for Company ID "
                        + application.getDriveId()
                        + " has been submitted successfully."
        );

        return savedApplication;
    }

    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    public Application updateApplication(
            Long id,
            Application updatedApplication) {

        Application application =
                applicationRepository.findById(id).orElse(null);

        if (application != null) {

            application.setStudentId(updatedApplication.getStudentId());
            application.setDriveId(updatedApplication.getDriveId());
            application.setApplicationStatus(updatedApplication.getApplicationStatus());
            application.setFullName(updatedApplication.getFullName());
            application.setEmail(updatedApplication.getEmail());
            application.setPhone(updatedApplication.getPhone());
            application.setBranch(updatedApplication.getBranch());
            application.setCgpa(updatedApplication.getCgpa());
            application.setCoverLetter(updatedApplication.getCoverLetter());

            return applicationRepository.save(application);
        }

        return null;
    }

    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}