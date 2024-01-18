package com.bree.springbootannotations.propertysource.PropertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Propertysourcedemo {

    @Value("${person.name}")
    private String name;

    @Value("${person.address}")
    private String address;

    @Value("${person.age}")
    private int age;

    @Value("${person.phonenumber}")
    private int phonenumber;

    @Value("${mail.username}")
    private String username;

    @Value("${mail.email}")
    private String email;

    @Value("${mail.password}")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }
}
