package org.example.lesson14;

import org.example.lesson14.shop.Product;
import org.example.lesson14.shop.ShoppingCart;
import org.example.lesson14.shop.Type;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a person enters go to store. Collects products (List<Product>).
        // Throw this list in the shoppingCart.

        Product product1 = new Product(Type.Book, 120.90, true);
        Product product2 = new Product(Type.Smartphones, 500.78, false);
        Product product3 = new Product(Type.Food, 13.78, false);
        Product product4 = new Product(Type.Toys, 655.78, true);
        Product product5 = new Product(Type.Book, 400.90, true);
        Product product6 = new Product(Type.Book, 60.90, false);
        Product product7 = new Product(Type.Book, 20.88, true);
        List<Product> list = List.of(product1, product2, product3, product4, product5, product6, product7);

        ShoppingCart shoppingCart = new ShoppingCart(list);

        // task 1
        // [Product{id=5, type=Book, price=400.9, discount=true, date=2023-09-26T22:28:39.665295700}]
        System.out.println(shoppingCart.getBooksLessThanNum());

        // task 2
        // all book (if discount = true) get discount. For example 10% (or another)
        // [Product{id=1, type=Book, price=108.80999711751939, discount=true, date=2023-09-26T22:28:39.664295400},
        // Product{id=5, type=Book, price=360.80999044179913, discount=true, date=2023-09-26T22:28:39.665295700},
        // Product{id=7, type=Book, price=18.791999502182005, discount=true, date=2023-09-26T22:28:39.665295700}]
        System.out.println(shoppingCart.discountBooks());

        // task 3
        // get the cheapest book
        // Product{id=7, type=Book, price=18.791999502182005, discount=true, date=2023-09-26T22:28:39.665295700}
        System.out.println(shoppingCart.getCheaperBook());

        // task 4
        // get 3 last products by time
        //[Product{id=2, type=Smartphones, price=500.78, discount=false, date=2023-09-26T22:28:39.665295700},
        // Product{id=3, type=Food, price=13.78, discount=false, date=2023-09-26T22:28:39.665295700},
        // Product{id=4, type=Toys, price=655.78, discount=true, date=2023-09-26T22:28:39.665295700}]

        System.out.println(shoppingCart.getThreeLastProductsByTime());

        // task 5
        // 79.691999502182
        System.out.println(shoppingCart.calculatePrice());

        // task 6
        // {Book=
        //      [Product{id=1, type=Book, price=108.80999711751939, discount=true, date=2023-09-26T22:28:39.664295400},
        //      Product{id=5, type=Book, price=360.80999044179913, discount=true, date=2023-09-26T22:28:39.665295700},
        //      Product{id=6, type=Book, price=60.9, discount=false, date=2023-09-26T22:28:39.665295700},
        //      Product{id=7, type=Book, price=18.791999502182005, discount=true, date=2023-09-26T22:28:39.665295700}],
        // Smartphones=
        //      [Product{id=2, type=Smartphones, price=500.78, discount=false, date=2023-09-26T22:28:39.665295700}],
        // Food=
        //      [Product{id=3, type=Food, price=13.78, discount=false, date=2023-09-26T22:28:39.665295700}],
        // Toys=
        //      [Product{id=4, type=Toys, price=655.78, discount=true, date=2023-09-26T22:28:39.665295700}]}

        System.out.println(shoppingCart.getHashProductCollection());
    }
}
