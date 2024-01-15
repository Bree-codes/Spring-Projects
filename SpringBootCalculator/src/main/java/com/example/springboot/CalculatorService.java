package com.example.springboot;

public class CalculatorService {

    private final Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int executeCalculation(int a, int b){
        return calculator.calculate(a,b);
    }
}
