package com.sparta.average;

import java.util.Scanner;

public class AverageApp {
    static void main(String[] args) {
        float result = averageInputs(4);
        System.out.printf("Average of the numbers: %.2f%n", result);
    }

    protected static int totalInputs(int numberOfInputs) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= numberOfInputs; i++){
            System.out.printf("Enter number %d: ", i);
            total += scanner.nextInt();
        }
        scanner.close();
        return total;
    }

    protected static float averageInputs(int numberOfInputs) {
        int total = totalInputs(numberOfInputs);
        float average = (float) total / numberOfInputs;
        return average;
    }
}