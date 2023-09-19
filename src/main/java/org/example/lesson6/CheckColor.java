package org.example.lesson6;

import lombok.*;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class CheckColor implements RandomNumGenerator {
    public void printColor() {
        int value = RandomNumGenerator.generate(-50, 150);
        if (value <= 0) {
            System.out.println("Value is " + value + "\nColor: Red");
        } else if (value <= 100) {
            System.out.println("Value is " + value + "\nColor: Yellow");
        } else {
            System.out.println("Value is " + value + "\nColor: Green");
        }
    }
}
