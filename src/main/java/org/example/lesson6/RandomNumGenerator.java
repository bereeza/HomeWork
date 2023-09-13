package org.example.lesson6;

import java.util.Random;

public interface RandomNumGenerator {
    static int generate(int origin, int bound) {
        Random random = new Random();
        return random.nextInt(origin, bound);
    }
}
