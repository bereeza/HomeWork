package org.example.lesson8;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ArrayValueCalculator {
    public int doCalc(String[][] str) {
        checkIfSizeCorrect(str);
        int[][] arr = new int[4][4];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum = sum + Integer.parseInt(str[i][j].trim());
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(
                            "Error parsing integer. Check num position [" + i + ", " + j + "]", e
                    );
                }
            }
        }
        return sum;
    }

    private void checkIfSizeCorrect(String[][] str) {
        if (str.length != 4) {
            throw new ArraySizeException("The length of the array is not equal to 4",
                    new IllegalArgumentException("Invalid array size"));
        }
    }
}
