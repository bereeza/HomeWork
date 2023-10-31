package org.example.lesson20.strategy;

import org.example.lesson20.strategy.figures.Rectangle;
import org.example.lesson20.strategy.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7.7, 6);
        Triangle triangle = new Triangle(4, 6);

        AreaCalculator rectangleCalculator = new AreaCalculator(rectangle);
        AreaCalculator triangleCalculator = new AreaCalculator(triangle);

        double rectangleArea = rectangleCalculator.calculateArea();
        double triangleArea = triangleCalculator.calculateArea();

        // Rectangle area: 46.2
        // Triangle area: 12.0
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Triangle area: " + triangleArea);
    }
}
