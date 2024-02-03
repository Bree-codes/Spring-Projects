package com.bree.springproject.valentinesmessage;

import com.bree.springproject.valentinesmessage.DTO.MailRequest;
import com.bree.springproject.valentinesmessage.DTO.MailResponse;
import com.bree.springproject.valentinesmessage.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ValentinesMessageApplication {

	@Autowired
	private MessageService messageService;

	@PostMapping("/sendingMessage")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		return messageService.sendEmail(request, null);
	}

	public static void main(String[] args) {
		SpringApplication.run(ValentinesMessageApplication.class, args);
	}

}
