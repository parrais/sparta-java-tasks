package com.sparta.vowelescape;

import java.util.Scanner;

public class VowelApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String userInput = getStringEntry("Please input a phrase: ", scanner);
        String[] answers = splitVowels(userInput);
        System.out.println("All of the vowels in upper case:\n" + answers[0] + "\nAll of the vowels removed:\n" + answers[1]);
        scanner.close();
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextLine();
    }

    private static String[] splitVowels(String userMessage) {
        char[] messageArray = userMessage.toCharArray();
        StringBuilder vowelsOnly = new StringBuilder();
        StringBuilder noVowels = new StringBuilder();
        for (char letter: messageArray) {
            char caps = Character.toUpperCase(letter);
            if (caps == 'A' || caps == 'E' || caps == 'I' || caps == 'O' || caps == 'U'){
                vowelsOnly.append(caps);
            } else {
                noVowels.append(letter);
            }
        }
        return new String[]{vowelsOnly.toString(), noVowels.toString()};
    }
}
