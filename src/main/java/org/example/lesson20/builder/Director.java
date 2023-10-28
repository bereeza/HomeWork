package org.example.lesson20.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.lesson20.builder.carType.CarType;

@Getter
@Setter
@AllArgsConstructor
public class Director {
    private Builder builder;

    public void constructCar(String engine, CarType type, int wheels) {
        builder.buildEngine(engine);
        builder.setType(type);
        builder.createdWheels(wheels);
    }

    public Car getResult() {
        return builder.constructionResult();
    }
}
