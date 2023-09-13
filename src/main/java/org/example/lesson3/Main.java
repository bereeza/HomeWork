package org.example.lesson3;

import org.example.lesson3.task1.Employee;
import org.example.lesson3.task4.Car;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom",
                "Korchakovskyi",
                "Serhiyovych",
                "director",
                "test@gmail.com",
                "+0991234567",
                34);
        System.out.println(employee);
        Car car = new Car();
        car.start();
    }
}
