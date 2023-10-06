package org.example.lesson16.task2;

import lombok.*;

@Getter
@Setter
public class PetrolStation implements RefuelingProcess{
    private int amount;
    private final int MAX_CARS_AMOUNT = 3;
    private int cars = 0;

    public PetrolStation(int amount) {
        this.amount = amount;
    }

    @SneakyThrows
    public synchronized void doRefuel(int fuelAmount) {
        if (amount < fuelAmount) {
            throw new FuelIsOutException("There is no or not enough fuel");
        }
        cars++;
        System.out.println("Refueling started.");
        amount -= fuelAmount;
        Thread.sleep(RefuelingProcess.timeOfRefuel());
        System.out.println("Refueling completed for Car. Fuel total: " + amount);
        cars--;
        notifyAll();
    }
}