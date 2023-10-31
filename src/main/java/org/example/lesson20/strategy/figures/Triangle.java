package org.example.lesson20.strategy.figures;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.lesson20.strategy.Area;

@Getter
@Setter
@AllArgsConstructor
public class Triangle implements Area {
    private double basis;
    private double height;

    @Override
    public double calculateArea() {
        return 0.5 * basis * height;
    }
}
