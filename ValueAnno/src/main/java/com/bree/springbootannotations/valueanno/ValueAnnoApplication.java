package com.bree.springbootannotations.valueanno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueAnnoApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(ValueAnnoApplication.class, args);
        demo Demo = context.getBean(demo.class);
        System.out.println(Demo.getDefaultName());
    }

}
