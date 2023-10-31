package org.example.lesson20.builder;

import org.example.lesson20.builder.car_type.Type;

public class Main {
    public static void main(String[] args) {
        Car car = Car.builder().engine("McLaren MP4-12C 3.8 TT").wheels(4).horsePower(450).type(Type.SPORT_CAR).build();
        // Car(engine=McLaren MP4-12C 3.8 TT, wheels=4, horsePower=450, type=SPORT_CAR)
        System.out.println(car);
    }
}
