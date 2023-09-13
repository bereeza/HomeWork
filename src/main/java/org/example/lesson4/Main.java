package org.example.lesson4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        dog.run(1250);
        dog.swim(456);
        Cat cat1 = new Cat("Tom");
        cat1.run(23);
        cat1.swim(12);
//        animal count check
//        Cat cat2 =  new Cat("Feliks");
        System.out.println("\nTotal count of animal: " + Animal.getTotalCount());
        System.out.println("Dog: " + Dog.getTotalCount());
        System.out.println("Cat: " + Cat.getTotalCount());
    }
}
