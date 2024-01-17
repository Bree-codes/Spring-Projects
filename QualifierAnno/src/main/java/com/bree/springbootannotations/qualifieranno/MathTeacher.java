package com.bree.springbootannotations.qualifieranno;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    @Override
    public String teach(){
        
        return "I am your maths teacher....";
    }


}
