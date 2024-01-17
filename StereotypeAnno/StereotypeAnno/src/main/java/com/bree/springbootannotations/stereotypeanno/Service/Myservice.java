package com.bree.springbootannotations.stereotypeanno.Service;

import org.springframework.stereotype.Component;

@Component
public class Myservice {
    public String service(){
        return "Welcome to the service page!";
    }
}
