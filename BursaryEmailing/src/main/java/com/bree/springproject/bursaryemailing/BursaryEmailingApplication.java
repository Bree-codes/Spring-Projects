package com.bree.springproject.bursaryemailing;

import com.bree.springproject.bursaryemailing.DTO.MailResponse;
import com.bree.springproject.bursaryemailing.DTO.MailRequest;
import com.bree.springproject.bursaryemailing.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BursaryEmailingApplication {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendingMessage")
    public MailResponse sendEmail(@RequestBody MailRequest request) {
        return mailService.sendEmail(request, null);
    }

    public static void main(String[] args) {
        SpringApplication.run(BursaryEmailingApplication.class, args);
    }

}
