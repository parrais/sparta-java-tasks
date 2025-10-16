package com.sparta.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapsApp {
    static void main() {
        String message = "The cat in the hat comes back"
                .trim()
                .toLowerCase();

        HashMap<Character, Integer> lettersCount = new HashMap<>();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if(currentChar != ' ') {
                if(lettersCount.containsKey(currentChar)) {
                    lettersCount.put(currentChar,lettersCount.get(currentChar)+1);
                } else {
                    lettersCount.put(currentChar,1);}
            }
        }

        for (Map.Entry<Character, Integer> entry: lettersCount.entrySet()) {
            System.out.println(entry);
        }
    }
}
