package com.bree.springbootannotations.componentannotation;

import com.bree.springbootannotations.componentannotation.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentAnnoApplication {

    public static void main(String[] args) {
      var context =  SpringApplication.run(ComponentAnnoApplication.class, args);
        PizzaController pizzaController = (PizzaController) context.getBean("pizzaDemo");
        System.out.println(pizzaController.getPizza());
    }

}
