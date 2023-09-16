package org.example.lesson5.task1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Circle implements Area {
    private int radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
