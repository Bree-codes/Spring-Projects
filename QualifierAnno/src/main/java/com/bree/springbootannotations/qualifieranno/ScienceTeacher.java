package com.bree.springbootannotations.qualifieranno;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

    @Override
    public String teach(){
        return "I am your Science teacher....";
    }

}
