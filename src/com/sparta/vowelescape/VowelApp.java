package com.sparta.vowelescape;

import java.util.Scanner;

public class VowelApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String userInput = getStringEntry("Please input a phrase: ", scanner);
        splitVowels(userInput);
        scanner.close();
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        String userString = scan.nextLine();
        return userString;
    }

    private static void splitVowels(String userMessage) {
        char[] messageArray = userMessage.toCharArray();
        String vowelsOnly = "";
        String noVowels = "";
        for (char letter: messageArray) {
            char caps = Character.toUpperCase(letter);
            if (caps == 'A' || caps == 'E' || caps == 'I' || caps == 'O' || caps == 'U'){
                vowelsOnly += caps;
            } else {
                noVowels += letter;
            }
        }
        System.out.println("All of the vowels in upper case:\n" + vowelsOnly + "\nAll of the vowels removed:\n" + noVowels);
    }
}
