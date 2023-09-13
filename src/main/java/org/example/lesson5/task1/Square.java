package org.example.lesson5.task1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Square implements Area {
    private int side;

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}