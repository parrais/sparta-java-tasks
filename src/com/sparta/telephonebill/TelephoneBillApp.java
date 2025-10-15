package com.sparta.telephonebill;

import java.util.Scanner;

public class TelephoneBillApp {
    public static void main(String[] args) {
        final double CALL_RATE = 0.15;
        final double VAT_RATE = 0.2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();

        double callCharge = minutes * CALL_RATE;
        double vatDue = callCharge * VAT_RATE;
        double totalBill = callCharge + vatDue;

        System.out.printf("Number of minutes: %d%nBasic call charge: £%.2f%nVAT due: £%.2f%nTotal bill: £%.2f%n",
                minutes, callCharge, vatDue, totalBill);
    }
}