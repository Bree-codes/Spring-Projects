package com.bree.springproject.springemail;

import com.bree.springproject.springemail.DTO.MailRequest;
import com.bree.springproject.springemail.DTO.MailResponse;
import com.bree.springproject.springemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringEmailApplication {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendingEmail")
    public MailResponse sendEmail(@RequestBody MailRequest request){
        Map<String ,Object> model = new HashMap<>();
        model.put("Name",request.getName());
        model.put("Location","Bahamas");
        return emailService.sendEmail(request,model);

    }

    public static void main(String[] args) {

        SpringApplication.run(SpringEmailApplication.class, args);
    }

}
