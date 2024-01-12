package com.bree.springproj.springcore.DedanKimathi;

public class School {

    private Student student;

    private  Teacher teacher;

    private Worker worker;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }


    public  void printInfo()
    {
        System.out.println(teacher + " " + student+ " " + worker);
    }



}
