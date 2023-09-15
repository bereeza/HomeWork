package org.example.lesson9.fruits;

public class Orange extends Fruit {
    private static final float MIN_WEIGHT = 0.9F;
    private static final float MAX_WEIGHT = 1.5F;

    public Orange() {
        super(MIN_WEIGHT, MAX_WEIGHT);
    }
}