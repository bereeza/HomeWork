package org.example.lesson16.task1;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList<Integer> list = new ThreadSafeListImpl<>();
        long start = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            list.add(1);
        }
        long result = System.nanoTime() - start;

        // 3339377200 --> with lock
        // 2133291000 --> default ArrayList, default list.add()
        // 3450294300 --> synchronized method
        System.out.println(result);

        ThreadSafeList<String> strList = new ThreadSafeListImpl<>();
        strList.add("Hello");
        strList.add("world");
        strList.add("str");
        // ThreadSafeListImpl(list=[Hello, world, str])
        System.out.println(strList);

        // str
        System.out.println(strList.get(2));
        // strList.get(2334) --> exception


        strList.remove("str");
        // ThreadSafeListImpl(list=[Hello, world])
        System.out.println(strList);

        // or remove by index
        // ThreadSafeListImpl(list=[Hello])
        strList.removeByIndex(1);
        System.out.println(strList);
    }
}
