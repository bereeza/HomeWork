package org.example.lesson16.task2;

import lombok.*;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class PetrolStation implements RefuelingProcess {
    private volatile AtomicInteger amount;

    public PetrolStation(int amount) {
        this.amount = new AtomicInteger(amount);
    }

    @SneakyThrows
    public void doRefuel(int fuelAmount) {
        if (amount.get() < fuelAmount) {
            throw new FuelIsOutException("There is no or not enough fuel");
        }
        System.out.println("Refueling started.");
        amount.updateAndGet(amount -> amount - fuelAmount);
        Thread.sleep(RefuelingProcess.timeOfRefuel());
        System.out.println("Refueling completed for Car. Fuel total: " + amount);
    }
}