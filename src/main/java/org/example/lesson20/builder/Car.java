package org.example.lesson20.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.lesson20.builder.carType.CarType;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    private String engine;
    private CarType type;
    private int wheels;
}
