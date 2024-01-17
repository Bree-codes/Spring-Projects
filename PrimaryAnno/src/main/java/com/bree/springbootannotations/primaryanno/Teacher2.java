package com.bree.springbootannotations.primaryanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("teacher2")
@Primary
public class Teacher2 implements Teachers{

    @Override
    public String teach(){
        return "I love my students!!";
    }
}
