package org.example.lesson16.task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) {
        PetrolStation station = new PetrolStation(200);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            executor.execute(() -> {
                System.out.println("Car " + num + " is requesting fuel.");
                station.doRefuel(23);
            });
        }

        executor.shutdown();


    }
}
