package org.example.lesson6;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
public class DigitsOperation implements Comparator<Integer>,
        RandomNumGenerator {
    public void checkSumSign() {
        int a = RandomNumGenerator.generate(-20, 20);
        int b = RandomNumGenerator.generate(-20, 20);
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum (" + a + ") + (" + b + ") is positive");
        } else {
            System.out.println("Sum (" + a + ") + (" + b + ") is negative");
        }
    }

    public boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public String isPositive(int a) {
        if (a >= 0) {
            return "Num is positive";
        } else {
            return "Num is negative";
        }
    }

    public boolean isNegative(int a) {
        return a <= 0;
    }

    public void compareNumbers() {
        int a = RandomNumGenerator.generate(-10, 10);
        int b = RandomNumGenerator.generate(-10, 10);
        int result = compare(a, b);
        if (result < 0) {
            System.out.println("a < b \n" + a + " < " + b);
        } else if (result > 0) {
            System.out.println("a > b\n" + a + " > " + b);
        } else {
            System.out.println("a == b\n" + a + " == " + b);
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
