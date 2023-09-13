package org.example.lesson4;

public class Cat extends Animal {
    private static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        int maxCatRunning = 200;
        if (distance <= maxCatRunning)
            System.out.println(getName() + " the cat running | Distance: " + distance);
        else
            System.out.println(getName() + " the cat does not run more than 200 meters");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat does not swim");
    }

    public static int getTotalCount() {
        return count;
    }
}
