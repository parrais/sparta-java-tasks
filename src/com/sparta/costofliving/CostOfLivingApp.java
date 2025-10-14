package com.sparta.costofliving;

import java.util.Scanner;

public class CostOfLivingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rent per month: ");
        double rent = scanner.nextDouble();
        System.out.print("Gas payment per month: ");
        double gas = scanner.nextDouble();
        System.out.print("Electricity payment per month: ");
        double electricity = scanner.nextDouble();
        System.out.print("Water payment per month: ");
        double water = scanner.nextDouble();
        System.out.print("Council tax payment per month: ");
        double councilTax = scanner.nextDouble();
        double totalCost = rent + gas + electricity + water + councilTax;
        System.out.printf("Your monthly expenses are:%n" +
                          "Rent:           £ %7.2f%n" +
                          "Gas:            £ %7.2f%n" +
                          "Electricity:    £ %7.2f%n" +
                          "Water:          £ %7.2f%n" +
                          "Council Tax     £ %7.2f%n" +
                          "=========================%n" +
                          "Total:          £ %7.2f%n" +
                          "=========================%n",
                rent,gas,electricity,water,councilTax,totalCost);
    }
}
