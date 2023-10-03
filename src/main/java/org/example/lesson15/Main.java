package org.example.lesson15;

public class Main {
    public static void main(String[] args) {
        ValueCalculator calculator = new ValueCalculator();
        // Time: 35ms
        calculator.calculateTime();

        // Also, noticed:
        // if i delete thread in divideArrayIntoTwo time is 53
        // if i use thread time is <40
    }
}
