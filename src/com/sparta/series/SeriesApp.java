package com.sparta.series;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SeriesApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = getFiveInputs(scanner);
        scanner.close();
        int[] outputs = calculateOutputs(inputs);
        produceLog(outputs);
    }

    private static int getIntEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextInt();
    }

    private static int[] getFiveInputs(Scanner scanner) {
        int[] inputs = new int[5];
        for (int i = 0; i < 5; i++){
            String prompt = "Please enter integer " + (i+1) + ": ";
            inputs[i] = getIntEntry(prompt, scanner);
        }
        return inputs;
    }

    private static int[] calculateOutputs(int[] inputs) {
        int totalPos = 0;
        int totalNeg = 0;
        for (int num : inputs) {
            if (num > 0) {
                totalPos += num;
            } else {
                totalNeg += num;
            }
        }
        return new int[]{totalPos, totalNeg};
    }

    private static void produceLog(int[] outputs) {
        if(outputs[0] == 0){
            System.out.println("No positive integers supplied.");
        } else {
            System.out.printf("The sum of all positive integers is: %s%n", outputs[0]);
        }
        if(outputs[1] == 0){
            System.out.println("No negative integers supplied.");
        } else {
            System.out.printf("The sum of all negative integers is: %s%n", outputs[1]);
        }
    }
}
