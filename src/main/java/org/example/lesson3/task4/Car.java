package org.example.lesson3.task4;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("The car is refueled!");
    }

    private void startCommand() {
        System.out.println("Turn the car key!");
    }

    private void startElectricity() {
        System.out.println("Let's start moving!");
    }
}