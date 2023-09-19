package org.example.lesson10;

import org.example.math.MathIntegerLib;

public class Main {
    public static void main(String[] args) {
        MathIntegerLib mathIntegerLib = new MathIntegerLib();
        System.out.println(mathIntegerLib.sum(1,1));
        System.out.println(mathIntegerLib.minus(1, 1));
        System.out.println(mathIntegerLib.multiply(1, 1));
        System.out.println(mathIntegerLib.divide(-6, 2));
        // exception
//        System.out.println(mathIntegerLib.divide(1, 0));
    }
}
