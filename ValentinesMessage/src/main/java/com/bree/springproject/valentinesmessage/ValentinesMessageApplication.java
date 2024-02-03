package com.bree.springproject.valentinesmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ValentinesMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValentinesMessageApplication.class, args);
	}

}
