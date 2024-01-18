package com.bree.springbootannotations.valueannopropertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {
    @Value("${student.name}")
    private String name;

    @Value("${student.grade}")
    private String grade;

    @Value("${student.regno}")
    private String regno;

    @Value("${student.course}")
    private String course;

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getRegno() {
        return regno;
    }

    public String getCourse() {
        return course;
    }
}
