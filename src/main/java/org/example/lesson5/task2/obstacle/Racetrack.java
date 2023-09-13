package org.example.lesson5.task2.obstacle;

import lombok.*;

import java.util.Random;

@Getter
@Setter
public class Racetrack extends Obstacle {
    private final int distance;

    public Racetrack() {
        distance = generateRandomLength();
    }

    private int generateRandomLength() {
        Random r = new Random();
        return r.nextInt(1000, 5000);
    }

    @Override
    public int getDistance() {
        return distance;
    }

}
