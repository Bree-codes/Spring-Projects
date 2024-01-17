package com.bree.springbootannotations.stereotypeanno.Controller;

import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String controller(){
        return "Welcome to the controller page";
    }
}
