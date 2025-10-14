package com.sparta.jsongenerator;

public class JsonGeneratorApp {
    public static void main(String[] args) {
        String firstName = "Alex";
        String lastName = "Chen";
        String email = "alex.chen@example.com";
        String phone = "+44 20 7946 0832";
        String occupation = "Software Engineer";
        boolean isActive = true;
        int yearsOfService = 4;

        System.out.printf("{%n  \"first_name\": \"%s\"%n  \"last_name\": \"%s\"%n  \"email\": \"%s\"%n  \"phone\": " +
                        "\"%s\"%n  \"occupation\": \"%s\"%n  \"is_active\": %b%n  \"years_service\": %d%n}",
                firstName, lastName, email, phone, occupation, isActive, yearsOfService);
    }
}
