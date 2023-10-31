package org.example.lesson20.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AreaCalculator {
    private Area area;

    public double calculateArea() {
        return area.calculateArea();
    }
}
