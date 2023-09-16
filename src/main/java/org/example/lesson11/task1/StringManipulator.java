package org.example.lesson11.task1;

import lombok.*;

import java.util.*;

@NoArgsConstructor
public class StringManipulator {
    public int countOccurrence(List<String> stringList, String str) {
        int counter = 0;
        for (String s : stringList) {
            if (s.equals(str)) {
                counter++;
            }
        }
        return counter;
    }

    public List<String> toList(String[] strings) {
        return Arrays.stream(strings)
                .toList();
    }

    public List<Integer> findUnique(List<Integer> list) {
        return list.stream()
                .distinct()
                .toList();
    }

    public List<Integer> findSuperUnique(List<Integer> list) {
        return list.stream()
                .filter(num -> list.stream().filter(x -> x.equals(num)).count() == 1)
                .toList();
    }
}
