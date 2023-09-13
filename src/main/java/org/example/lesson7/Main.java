package org.example.lesson7;

public class Main {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        System.out.println("\nTask 2");
        int count = manipulator.findSymbolOccurrence("Hello, world", 'l');
        System.out.println(count);

        System.out.println("\nTask 3");
        manipulator.findWordPosition("Apple", "pl");

        System.out.println("\nTask 4");
        String stringReverse = manipulator.stringReverse("Hello, world");
        System.out.println(stringReverse);

        System.out.println("\nTask 5");
        boolean palindrome = manipulator.isPalindrome("ERe");
        System.out.println(palindrome);

//        System.out.println("\nTask 6");
//        Game game = new Game();
//        game.startGame();
    }
}