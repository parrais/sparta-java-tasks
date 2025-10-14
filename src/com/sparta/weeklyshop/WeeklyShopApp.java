package com.sparta.weeklyshop;

import java.util.Scanner;

public class WeeklyShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Peaches%n-how many? ");
        int peachesAmount = scanner.nextInt();
        System.out.print("-price? ");
        double peachesPrice = scanner.nextDouble();
        System.out.printf("Beans (cans of)%n-how many? ");
        int beansAmount = scanner.nextInt();
        System.out.print("-price? ");
        double beansPrice = scanner.nextDouble();
        System.out.printf("Chicken pieces (packets of)%n-how many? ");
        int chickenAmount = scanner.nextInt();
        System.out.print("-price? ");
        double chickenPrice = scanner.nextDouble();
        System.out.printf("Socks (pairs of)%n-how many? ");
        int socksAmount = scanner.nextInt();
        System.out.print("-price? ");
        double socksPrice = scanner.nextDouble();
        System.out.printf("Bottles of water%n-how many? ");
        int waterAmount = scanner.nextInt();
        System.out.print("-price? ");
        double waterPrice = scanner.nextDouble();
        int totalItems = peachesAmount + beansAmount + chickenAmount + socksAmount + waterAmount;
        double totalPrice = (double) peachesAmount * peachesPrice + (double) beansAmount * beansPrice
                + (double) chickenAmount * chickenPrice + (double) socksAmount * socksPrice + (double) waterAmount * waterPrice;
        System.out.printf("Total number of items purchased: %d%nYour weekly shop cost: %3.2f%n", totalItems, totalPrice);
    }
}
