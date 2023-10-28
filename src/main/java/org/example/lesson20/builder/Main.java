package org.example.lesson20.builder;

import org.example.lesson20.builder.carType.CarType;

public class Main {
    public static void main(String[] args) {
        Builder carBuilder = new CarBuilder();
        Director director = new Director(carBuilder);

        director.constructCar("Porsche 911 GT3 4.0 NA F6", CarType.SPORT_CAR, 4);
        Car car = director.getResult();

        // A car has been created: Car(engine=Porsche 911 GT3 4.0 NA F6, type=SPORT_CAR, wheels=4)
        System.out.println("A car has been created: " + car);
    }
}