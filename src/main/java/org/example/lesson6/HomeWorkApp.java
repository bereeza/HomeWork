package org.example.lesson6;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("\nTask 2");
        printThreeWords();

        System.out.println("\nTask 3");
        DigitsOperation digits = new DigitsOperation();
        digits.checkSumSign();

        System.out.println("\nTask 4");
        CheckColor checkColor = new CheckColor();
        checkColor.printColor();

        System.out.println("\nTask 5");
        digits.compareNumbers();

        System.out.println("\nTask 6");
        boolean sumResult = digits.checkSum(0, 1);
        System.out.println(sumResult);

        System.out.println("\nTask 7");
        String valueResult = digits.isPositive(-12);
        System.out.println(valueResult);

        System.out.println("\nTask 8");
        boolean valueBooleanResult = digits.isNegative(2);
        System.out.println(valueBooleanResult);

        System.out.println("\nTask 9");
        String string = "Hello, world!";
        RepeatPrinter printer = new RepeatPrinter();
        printer.printNTimes(3, string);

        System.out.println("\nTask 10");
        Year year = new Year();
        boolean result = year.isLeap(2000);
        System.out.println(result);
    }

    private static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple""");
    }
}
