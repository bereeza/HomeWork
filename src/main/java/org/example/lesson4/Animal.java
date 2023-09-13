package org.example.lesson4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distance) {
        System.out.println("Animal running | distance: " + distance);
    }

    public void swim(int distance) {
        System.out.println("Animal swimming | distance: " + distance);
    }

    public static int getTotalCount() {
        return count;
    }
}
