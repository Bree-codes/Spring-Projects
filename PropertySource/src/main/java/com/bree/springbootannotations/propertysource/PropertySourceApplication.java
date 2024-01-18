package com.bree.springbootannotations.propertysource;

import com.bree.springbootannotations.propertysource.PropertySource.Propertysourcedemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertySourceApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(PropertySourceApplication.class, args);
        Propertysourcedemo propertysourcedemo = context.getBean(Propertysourcedemo.class);

        System.out.println("Person's details:" + propertysourcedemo.getName()+ " "+ propertysourcedemo.getPhonenumber() + " "+ propertysourcedemo.getAddress() + " " + propertysourcedemo.getAge());
        System.out.println("Mail details :" + propertysourcedemo.getUsername() + " "+ propertysourcedemo.getEmail() + " " + propertysourcedemo.getPassword());
    }

}
