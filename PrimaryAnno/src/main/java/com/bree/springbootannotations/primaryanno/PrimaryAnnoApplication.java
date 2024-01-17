package com.bree.springbootannotations.primaryanno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimaryAnnoApplication {

    private Teachers teacher2;

    public static void main(String[] args) {

        var context = SpringApplication.run(PrimaryAnnoApplication.class, args);
        Teacher2 teacher2 = (Teacher2) context.getBean("teacher2");
        System.out.println(teacher2.teach());
    }

}
