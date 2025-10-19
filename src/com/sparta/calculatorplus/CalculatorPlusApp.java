package com.sparta.calculatorplus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorPlusApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = getIntEntry("Please input the first number: ", scanner);
        int secondNumber = getIntEntry("Please input the second number: ", scanner);
        char operator = getCharEntry("Please enter an operator ( + - / * ): ", scanner);
        scanner.close();

        double result = calculateSum(firstNumber, secondNumber, operator);
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.printf("Your sum is %d %c %d and the answer is %s%n", firstNumber, operator, secondNumber, df.format(result));
    }

    private static int getIntEntry(String message, Scanner scan) {
        System.out.print(message);
        int userInt = scan.nextInt();
        return userInt;
    }

    private static char getCharEntry(String message, Scanner scan) {
        System.out.print(message);
        char userChar = scan.next().trim().charAt(0);
        return userChar;
    }

    private static double calculateSum(int num1, int num2, char oper) {
        switch(oper) {
            case '/':
                return (double) num1 / num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                return num1 + num2;
        }
    }
}
