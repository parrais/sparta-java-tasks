package com.sparta.sweettooth;

public class SweetToothApp {
    public static void main(String[] args) {
        int sweetsInPacket = 40;
        int students = 14;

        int sweetsLeft = sweetsInPacket % students;
        int sweetsEach = sweetsInPacket / students;

        System.out.println("Sweets per child: " + sweetsEach);
        System.out.println("Sweets kept by teacher: " + sweetsLeft);
    }
}
