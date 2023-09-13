package org.example.lesson9.fruits;

import org.example.lesson9.RandomNumGenerator;

import java.util.Random;

public class FruitWeightGenerator implements RandomNumGenerator<Float> {

    @Override
    public Float generateNum(Float min, Float max) {
        Random r = new Random();
        return Math.round(r.nextFloat(min, max) * 10.0f) / 10.0f;
    }
}
