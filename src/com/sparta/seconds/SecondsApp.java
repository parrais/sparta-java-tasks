package com.sparta.seconds;

import java.util.Scanner;

public class SecondsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int input = scanner.nextInt();
        int hours = input / 3600;
        int minutes = input % 3600 / 60;
        int seconds = input % 60;
        System.out.printf("     Input     Hours   Minutes   Seconds%n" +
                "%10d %9d%10d%10d%n", input, hours, minutes, seconds);
    }
}
