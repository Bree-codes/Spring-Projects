package com.bree.springbootannotations.componentannotation.controller;

import org.springframework.stereotype.Component;

@Component("pizzaDemo")
public class PizzaController {

public String getPizza(){
        return "Hot Pizza!!!";
    }
}
