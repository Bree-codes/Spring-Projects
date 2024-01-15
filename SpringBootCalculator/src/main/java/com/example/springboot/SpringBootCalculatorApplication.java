package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootCalculatorApplication.class, args);

        CalculatorService calculatorService = new CalculatorService(new Addition());
        int result = calculatorService.executeCalculation(4,5);
        System.out.println("The result is:" + result);
    }
}
