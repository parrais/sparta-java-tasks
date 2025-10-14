package com.sparta.address;

import java.util.Scanner;

public class AddressApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Surname? ");
        String surname = scanner.nextLine();
        System.out.print("House number? ");
        int house = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Road name? ");
        String road = scanner.nextLine();
        System.out.print("Town? ");
        String town = scanner.nextLine();
        System.out.printf("Mr and Mrs %s,%n%s, %s%n%s%n", surname, house, road, town);
    }
}
