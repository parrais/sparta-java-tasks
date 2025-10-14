package com.sparta.calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        double numerator = Double.parseDouble(args[0]);
        double denominator = Double.parseDouble(args[1]);

        double result = numerator / denominator;

        System.out.println(result);
    }
}
