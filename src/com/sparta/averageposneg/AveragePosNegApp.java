package com.sparta.averageposneg;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AveragePosNegApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = getTenInputs(scanner);
        scanner.close();
        double[] outputs = calculateOutputs(inputs);
        System.out.println(Arrays.toString(inputs) + Arrays.toString(outputs));
        produceLog(outputs);
    }

    private static int getIntEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextInt();
    }

    private static int[] getTenInputs(Scanner scanner) {
        int[] inputs = new int[10];
        for (int i = 0; i < 10; i++){
            String prompt = "Please enter integer " + (i+1) + ": ";
            inputs[i] = getIntEntry(prompt, scanner);
        }
        return inputs;
    }

    private static double[] calculateOutputs(int[] inputs) {
        int totalPos = 0;
        int totalNeg = 0;
        int countPos = 0;
        int countNeg = 0;
        for (int num : inputs) {
            if (num > 0) {
                totalPos += num;
                countPos++;
            } else if (num < 0) {
                totalNeg += num;
                countNeg++;
            }
        }
        double meanPos = (countPos > 0) ? (double) totalPos / countPos : 0;
        double meanNeg = (countNeg > 0) ? (double) totalNeg / countNeg : 0;
        return new double[]{totalPos, meanPos, totalNeg, meanNeg};
    }

    private static void produceLog(double[] outputs) {
        DecimalFormat df = new DecimalFormat("0.###");
        if(outputs[0] == 0){
            System.out.println("No positive integers supplied.");
        } else {
            System.out.printf("The sum of all positive integers is: %s%nThe average of all positive integers is: %s%n", df.format(outputs[0]), df.format(outputs[1]));
        }
        if(outputs[2] == 0){
            System.out.println("No negative integers supplied.");
        } else {
            System.out.printf("The sum of all negative integers is: %s%nThe average of all negative integers is: %s%n", df.format(outputs[2]), df.format(outputs[3]));
        }
    }
}
