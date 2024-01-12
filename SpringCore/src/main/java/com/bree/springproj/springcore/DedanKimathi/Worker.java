package com.bree.springproj.springcore.DedanKimathi;

public class Worker extends Person{

    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString()
    {
        return "Worker : "+ super.getFName() + " | " + salary + "\n";
    }
}
