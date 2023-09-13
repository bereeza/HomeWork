package org.example.lesson11.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("One", "Two", "three", "two", "TWO", "Two", "six", "ten", "eleven");
        String[] strings = {"One", "Two", "three", "two", "TWO", "Two", "six", "ten", "eleven"};
        StringManipulator stringManipulator = new StringManipulator();
        // 2
        System.out.println(stringManipulator.countOccurrence(stringList, "Two"));

        System.out.println(stringManipulator.toList(strings));

        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 3, 8, 2, 2);
        // [1, 2, 3, 4, 5, 8]
        System.out.println(stringManipulator.findUnique(list));
        // [4, 5, 8]
        System.out.println(stringManipulator.findSuperUnique(list));
    }
}
