package org.example.lesson7;

import lombok.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Game {
    private final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
            "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};
    private static String SECRET_WORD = "***************";

    public void startGame() {
        printAllWords();
        System.out.println("Let's start the game!");
        getResult();
    }

    private void getResult() {
        String computer = getComputerAnswer();
        String user;
        while (true) {
            user = getUserAnswer();
            if (user.equals(computer)) {
                System.out.println("Win!");
                return;
            } else {
                System.out.println("\nTry again:");
                compareWords(user, computer);
            }
        }
    }

    private void compareWords(String user, String computer) {
        int length = Math.min(user.length(), computer.length());
        StringBuilder builder = new StringBuilder(SECRET_WORD);
        for (int i = 0; i < length; i++) {
            if (user.charAt(i) == computer.charAt(i)) {
                builder.setCharAt(i, user.charAt(i));
            }
        }
        SECRET_WORD = builder.toString();
        System.out.println(SECRET_WORD);
    }

    private String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

    private String getComputerAnswer() {
        int index = generateRandomIndex(words.length);
        return words[index];
    }

    private int generateRandomIndex(int length) {
        Random r = new Random();
        return r.nextInt(length);
    }

    private void printAllWords() {
        System.out.println(Arrays.toString(words));
    }
}