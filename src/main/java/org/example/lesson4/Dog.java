package org.example.lesson4;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        int maxDogRunning = 500;
        if (distance <= maxDogRunning)
            System.out.println(getName() + " the dog running | Distance: " + distance);
        else
            System.out.println(getName() + " the dog does not run more than 500 meters");
    }

    @Override
    public void swim(int distance) {
        int maxDogSwimming = 10;
        if (distance <= maxDogSwimming)
            System.out.println(getName() + " the dog swimming | Distance: " + distance);
        else
            System.out.println(getName() + " the dog does not swim more than 10 meters");
    }

    public static int getTotalCount() {
        return count;
    }
}
