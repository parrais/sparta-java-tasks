package com.sparta.cuboid;

import java.util.Scanner;

public class CuboidApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("(All responses must be positive integers.)%nWhat is the width of your cuboid? ");
        int width = scanner.nextInt();
        System.out.print("What is the length of your cuboid? ");
        int length = scanner.nextInt();
        System.out.print("What is the height of your cuboid? ");
        int height = scanner.nextInt();
        int surfaceArea = 2 * (width * length + width * height + length * height);
        int volume = width * length * height;
        System.out.printf("Your cuboid has surface area %d and volume %d.%n", surfaceArea, volume);
    }
}
