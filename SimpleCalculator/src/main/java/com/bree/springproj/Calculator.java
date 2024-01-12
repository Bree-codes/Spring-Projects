package com.bree.springproj;

public class Calculator {
    DatabaseConnection database;
    double num1;
    double num2;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void Subtraction() throws Exception{
        database = new DatabaseConnection();
        database.connection();
        double result = num1 - num2;
        database.insertion(num1, num2,"Subtraction",result);

    }

    public void Addition() throws Exception {
        database = new DatabaseConnection();
        database.connection();
        double result = num1 + num2;
        database.insertion(num1, num2,"Addition",result);
    }

    public void Multiplication() throws Exception{
        database = new DatabaseConnection();
        database.connection();
        double result = num1 * num2;
        database.insertion(num1, num2,"Multiplication",result);
    }

    public void Division() throws Exception{
        database = new DatabaseConnection();
        database.connection();
        double result = num1 / num2;
        database.insertion(num1, num2,"Division",result);

    }



    /*public void DisplayResults() throws Exception {
        System.out.println("Subtraction: " + Subtraction());
        System.out.println("Addition: " + Addition());
        System.out.println("Multiplication: " + Multiplication());
        System.out.println("Division: " + Division());
    }*/

}
