package com.bree.springproj.springcore.DedanKimathi;

public class Student extends Person {

    private String regNo;

    private String course;

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString(){
        return "Student : " + super.getFName() +" | "+ regNo + "\n";
    }
}
