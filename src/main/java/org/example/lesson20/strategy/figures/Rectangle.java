package org.example.lesson20.strategy.figures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.lesson20.strategy.Area;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle implements Area {
    private double height;
    private double width;

    @Override
    public double calculateArea() {
        return height * width;
    }
}
