package org.example.lesson20.builder;

import org.example.lesson20.builder.carType.CarType;

public class CarBuilder implements Builder {
    private String engine;
    private CarType type;
    private int wheels;

    @Override
    public void buildEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public void createdWheels(int wheels) {
        this.wheels = wheels;
    }

    public Car constructionResult() {
        return new Car(engine, type, wheels);
    }
}
