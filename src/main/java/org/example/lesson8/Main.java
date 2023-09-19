package org.example.lesson8;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        // test #1
//        String[][] arr = {{"-3", "4", "    1", "1"},
//                {"2", " 0  ", "-23", "  5"},
//                {"1", "23", "  1", "4"},
//                {"2  ", "4", "66", " 2"}};

        // test #2
        String[][] arr = {{"-3", "4", "    1", "1"},
                {"2", "0   ", "-23", "  5 "},
                {"  1", "23", "1", "4"},
                {"2", "4", "66", "2"},
                {"1", "  -2"}};

        // test #3
//        String[][] arr = {{"-3", "4", "    1", "1"},
//                {"2", "0", "-23", "  5"},
//                {"1", "abc", "1", "4"},
//                {"2", "4", "66", "2"}};
        try {
            ArrayValueCalculator calculator = new ArrayValueCalculator();
            System.out.println(calculator.doCalc(arr));
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Something went wrong.\n" + e.getMessage());
        }
    }
}
