package com.sparta.thunderbirds;

import java.util.Scanner;

public class ThunderbirdApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int thunderbird = getEntry(scanner);
        outputPilot(thunderbird);
        scanner.close();
    }

    private static int getEntry(Scanner scan) {
        System.out.print("Please input a Thunderbird number: ");
        int userEntry = scan.nextInt();
        return userEntry;
    }

    private static void outputPilot(int vehicle) {
        if (vehicle < 1 || vehicle > 4) {
            System.out.println("Have you never watched Thunderbirds!");
        } else {
            String[] pilots = {"Scott", "Virgil", "Alan", "Gordon"};
            System.out.printf("Thunderbird %d pilot is %s Tracy%n", vehicle, pilots[vehicle - 1]);
        }
    }
}
