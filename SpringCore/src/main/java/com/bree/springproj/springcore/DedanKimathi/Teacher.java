package com.bree.springproj.springcore.DedanKimathi;

public class Teacher extends Person {

    private String unit;
    private float salary;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString()
    {
        return " Teacher : " + super.getFName() + " | " + super.getId() + "\n";
    }
}
