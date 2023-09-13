package org.example.lesson11.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bird", "fox", "cat", "bird", "hedgehog", "wolf", "fox", "bird", "turtle", "bird", "elephant");
        List<String> words1 = Arrays.asList("wolf", "fox", "lion", "bird", "tiger", "wolf", "fox", "turtle", "turtle", "bird", "fox");
        ObjectOccurrence occurrence = new ObjectOccurrence();
        System.out.println(occurrence.findOccurrence(words1));
        occurrence.calcOccurrence(words);

//        [Words(name=wolf, count=2), Words(name=fox, count=3), Words(name=lion, count=1), Words(name=bird, count=2), Words(name=tiger, count=1), Words(name=turtle, count=2)]
//        bird: 4
//        fox: 2
//        cat: 1
//        hedgehog: 1
//        wolf: 1
//        turtle: 1
//        elephant: 1
    }
}
