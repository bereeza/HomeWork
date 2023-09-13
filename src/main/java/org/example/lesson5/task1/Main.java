package org.example.lesson5.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Square square = new Square(10);
        Triangle triangle = new Triangle(12, 7);
        Object[] figures = {circle, square, triangle};
        double totalArea = Arrays.stream(figures)
                .filter(obj -> obj instanceof Area)
                .mapToDouble(obj -> ((Area) obj).getArea())
                .sum();
        // Total sum area: 594.3893421169303
        System.out.println("Total sum area: " + totalArea);
    }
}
