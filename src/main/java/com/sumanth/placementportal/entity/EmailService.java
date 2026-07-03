package com.sumanth.placementportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendSelectionMail(String toEmail) {

        System.out.println("Sending email to: " + toEmail);

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);

        message.setSubject("Congratulations! Placement Selection");

        message.setText(
                "Dear Student,\n\n" +
                        "Congratulations! You have been selected in the placement process.\n\n" +
                        "Best Regards,\n" +
                        "Placement Portal Team"
        );

        mailSender.send(message);

        System.out.println("Email Sent Successfully");
    }
}