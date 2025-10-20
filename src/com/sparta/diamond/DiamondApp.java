package com.sparta.diamond;

import java.util.Arrays;
import java.util.Scanner;

public class DiamondApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int diamondSize = getIntEntry("Please input a width for the diamond (2-40): ", scanner);
        scanner.close();
        String diamond = buildDiamond(diamondSize);
        System.out.println(diamond);
    }

    private static int getIntEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextInt();
    }

    private static String buildDiamond(int width) {
        if (width < 2 || width > 40) {
            return "Diamond size is out of bounds!";
        }
        String[] diamondRows = new String[2 * width - 1];
        for (int i = 0; i < width; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < width - i - 1; j++) {
                row.append(" ");
            }
            row.append("*");
            for (int k = 0; k < i; k++) {
                row.append(" *");
            }
            String diamondRow = row.toString();
            diamondRows[i] = diamondRow;
            diamondRows[2 * width - i - 2] = diamondRow;
        }
        return String.join("\n", diamondRows);
    }
}
