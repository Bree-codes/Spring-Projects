package com.bree.springbootannotations.valueannopropertyfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueAnnoPropertyfileApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(ValueAnnoPropertyfileApplication.class, args);
        ValueDemo valueDemo = context.getBean(ValueDemo.class);
        System.out.println(valueDemo.getName()+ " " + valueDemo.getRegno() + " " + valueDemo.getCourse()+ " " + valueDemo.getGrade());
    }

}
