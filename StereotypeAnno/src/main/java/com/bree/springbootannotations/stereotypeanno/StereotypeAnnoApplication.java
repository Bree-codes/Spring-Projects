package com.bree.springbootannotations.stereotypeanno;

import com.bree.springbootannotations.stereotypeanno.Controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StereotypeAnnoApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(StereotypeAnnoApplication.class, args);
        MyController myController = context.getBean(MyController.class);
        System.out.println(myController.controller());
    }

}
