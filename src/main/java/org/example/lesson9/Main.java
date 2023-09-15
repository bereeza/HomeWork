package org.example.lesson9;

import org.example.lesson9.fruits.Apple;
import org.example.lesson9.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Orange> box = new Box<>();
        Orange orange = new Orange();
        box.add(orange);

        Box<Orange> box2 = new Box<>();
        Orange orange2 = new Orange();
        box2.add(orange2);
        System.out.println(box.compare(box2));
        box.merge(box2);
        System.out.println(orange.getWeight()
                + " --- " + orange2.getWeight()
        + " | " +box.getWeight());
    }
}