package org.example.lesson5.task1;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Triangle implements Area {
    private int base;
    private int height;

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
