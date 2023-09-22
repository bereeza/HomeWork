package org.example.lesson13;

import org.example.lesson13.coffee.order.CoffeeOrderBoard;
import org.example.lesson13.coffee.order.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        Order order = new Order("Petr");
        Order order1 = new Order("Bob");

        // test 1
        coffeeOrderBoard.add(order);
        coffeeOrderBoard.add(order1);

        List<Order> list = List.of(new Order("Matt Murdock"),
                new Order("Artem"),
                new Order("Carl"),
                new Order("Luke"),
                new Order("Captain Rex"));
        coffeeOrderBoard.addAll(list);
        System.out.println(coffeeOrderBoard);

        // test 2
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println(coffeeOrderBoard);
//        num: 1| name: Petr
//        Num | Name:
//[
//        num: 2| name: Bob,
//                num: 3| name: Matt Murdock,
//        num: 4| name: Artem,
//                num: 5| name: Carl,
//                num: 6| name: Luke,
//                num: 7| name: Captain Rex]

        // test 3
//        throw exception
//        coffeeOrderBoard.deliver(434);
        coffeeOrderBoard.deliver(4);
        System.out.println(coffeeOrderBoard);

//        Num | Name:
//[
//        num: 2| name: Bob,
//                num: 3| name: Matt Murdock,
//        num: 5| name: Carl,
//                num: 6| name: Luke,
//                num: 7| name: Captain Rex]

        coffeeOrderBoard.draw();
//        Num | Name:
//[
//        num: 2| name: Bob,
//                num: 3| name: Matt Murdock,
//        num: 5| name: Carl,
//                num: 6| name: Luke,
//                num: 7| name: Captain Rex]

        coffeeOrderBoard.deliver();
    }
}
