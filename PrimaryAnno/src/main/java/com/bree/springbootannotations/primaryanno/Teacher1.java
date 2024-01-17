package com.bree.springbootannotations.primaryanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Teacher1 implements Teachers{
    @Override
    public String teach() {

        return "I hate my students!!";
    }

    private Teacher2 teacher2;

    @Autowired
    public Teacher1(Teacher2 teacher2) {
        this.teacher2 = teacher2;
    }

}
