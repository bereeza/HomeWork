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

//        Car 2 is requesting fuel.
//                Car 1 is requesting fuel.
//                Refueling started.
//                Car 3 is requesting fuel.
//                Refueling completed for Car. Fuel total: 177
//        Car 4 is requesting fuel.
//                Refueling started.
//                Refueling completed for Car. Fuel total: 154
//        Refueling started.
//        Car 5 is requesting fuel.
//                Refueling completed for Car. Fuel total: 131
//        Refueling started.
//        Car 6 is requesting fuel.
//                Refueling completed for Car. Fuel total: 108
//        Car 7 is requesting fuel.
//                Refueling started.
//                Refueling completed for Car. Fuel total: 85
//        Refueling started.
//        Car 8 is requesting fuel.
//                Refueling completed for Car. Fuel total: 62
//        Refueling started.
//        Car 9 is requesting fuel.
//                Refueling completed for Car. Fuel total: 39
//        Car 10 is requesting fuel.
//                Refueling started.
//                Refueling completed for Car. Fuel total: 16
//                exception: There is no or not enough fuel
    }
}
