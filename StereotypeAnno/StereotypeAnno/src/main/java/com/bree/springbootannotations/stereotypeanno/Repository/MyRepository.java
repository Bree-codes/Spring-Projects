package com.bree.springbootannotations.stereotypeanno.Repository;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {
     public String repository(){
         return "This is my repository page...";
     }
}
