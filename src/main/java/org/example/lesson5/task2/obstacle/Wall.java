package org.example.lesson5.task2.obstacle;

import lombok.*;

import java.util.Random;

@Getter
@Setter
public class Wall extends Obstacle {
    private final int distance;

    public Wall() {
        distance = generateRandomHeight();
    }

    private int generateRandomHeight() {
        Random r = new Random();
        return r.nextInt(20, 200);
    }

    @Override
    public int getDistance() {
        return distance;
    }
}
