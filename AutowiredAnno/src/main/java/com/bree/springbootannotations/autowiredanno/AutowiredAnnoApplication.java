package com.bree.springbootannotations.autowiredanno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowiredAnnoApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(AutowiredAnnoApplication.class, args);
        Teacher1 teacher1 = (Teacher1) context.getBean("mwalimu");
        System.out.println(teacher1.teach());
    }

}
