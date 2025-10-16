package com.sparta.thunderbirds;

import java.util.Scanner;

public class ThunderbirdApp {
    static void main() {
        int thunderbird = getEntry();
        outputPilot(thunderbird);
    }

    private static int getEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a Thunderbird number: ");
        int userEntry = scanner.nextInt();
        scanner.close();
        return userEntry;
    }

    private static void outputPilot(int vehicle) {
        if (vehicle < 1 || vehicle > 4) {
            System.out.println("Have you never watched Thunderbirds!%n");
        } else {
            String[] pilots = {"Scott", "Virgil", "Alan", "Gordon"};
            System.out.printf("Thunderbird %d pilot is %s Tracy%n", vehicle, pilots[vehicle - 1]);
        }
    }
}
