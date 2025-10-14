package com.sparta.distancecalculator;

import java.util.Scanner;

public class DistanceCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial velocity (m/s)? ");
        double initialVelocity = scanner.nextDouble();
        System.out.print("Time taken (s)? ");
        double timeTaken = scanner.nextDouble();
        System.out.print("Acceleration (m/s^2)? ");
        double acceleration = scanner.nextDouble();
        double distance = initialVelocity * timeTaken + 0.5 * acceleration * timeTaken * timeTaken;
        System.out.printf("The distance travelled is %3.2f metres.%n", distance);
    }
}
