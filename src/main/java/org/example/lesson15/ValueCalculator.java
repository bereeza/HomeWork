package org.example.lesson15;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class ValueCalculator {
    private float[] array;
    private int capacity = 1000000;
    private int half = capacity / 2;

    public void calculateTime() {
        long start = System.currentTimeMillis();
        array = new float[capacity];
        Arrays.fill(array, 1);
        divideArrayIntoTwo(array);
        long result = System.currentTimeMillis() - start;
        System.out.println("Time: " + result + "ms");
    }

    @SneakyThrows
    private void divideArrayIntoTwo(float[] arr) {
        float[] firstArray = new float[half];
        float[] secondArray = new float[half];

        System.arraycopy(arr, 0, firstArray, 0, half);
        System.arraycopy(arr, half, secondArray, 0, half);

        Thread threadArrFirst = new Thread(() -> arrayPlaceholder(firstArray));
        Thread threadArrSecond = new Thread(() -> arrayPlaceholder(secondArray));
        threadArrFirst.start();
        threadArrSecond.start();
        threadArrFirst.join();
        threadArrSecond.join();

        System.arraycopy(firstArray, 0, arr, 0, half);
        System.arraycopy(secondArray, 0, arr, half, half);
    }

    private void arrayPlaceholder(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
