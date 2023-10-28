package org.example.lesson20.builder;

import org.example.lesson20.builder.carType.CarType;

public interface Builder {
    void buildEngine(String engine);

    void setType(CarType type);

    void createdWheels(int wheels);

    Car constructionResult();
}
