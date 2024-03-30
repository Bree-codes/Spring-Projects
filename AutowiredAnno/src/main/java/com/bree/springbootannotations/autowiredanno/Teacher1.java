package com.bree.springbootannotations.autowiredanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mwalimu")
public class Teacher1 {

   /* public String teach(){
        

    private Teacher2 teacher2;

    //constructor injection
    @Autowired
    public Teacher1(Teacher2 teacher2) {

        this.teacher2 = teacher2;
    }
    public String teach(){
        return teacher2.teach();
    }
}
