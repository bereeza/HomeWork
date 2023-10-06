package org.example.lesson16.task2;

import java.util.Random;

public interface RefuelingProcess {
    static long timeOfRefuel() {
        Random r = new Random();
        return r.nextLong(3000, 10000);
    }
}
