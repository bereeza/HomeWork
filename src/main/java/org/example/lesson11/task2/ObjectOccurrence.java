package org.example.lesson11.task2;

import lombok.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@NoArgsConstructor
public class ObjectOccurrence {
    public void calcOccurrence(List<String> list) {
        List<Words> wordOccurrences = new ArrayList<>();
        occurrenceWorker(list, wordOccurrences);
        resultPrinter(wordOccurrences);
    }

    public List<Words> findOccurrence(List<String> list) {
        List<Words> wordOccurrences = new ArrayList<>();
        occurrenceWorker(list, wordOccurrences);
        return wordOccurrences;
    }

    private void resultPrinter(List<Words> wordOccurrences) {
        for (Words word : wordOccurrences) {
            System.out.println(word.getName() + ": " + word.getCount());
        }
    }

    private void occurrenceWorker(List<String> list, List<Words> wordOccurrences) {
        long start = System.nanoTime();

        // 1 test
        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            boolean found = false;
            for (Words w : wordOccurrences) {
                if (w.getName().equals(word)) {
                    w.setCount(w.getCount() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                wordOccurrences.add(new Words(word, 1));
            }
        }

        // 2 test
        for (String word : list) {
            boolean found = false;
            for (Words w : wordOccurrences) {
                if (w.getName().equals(word)) {
                    w.setCount(w.getCount() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                wordOccurrences.add(new Words(word, 1));
            }
        }

        // 3 test
        for (String word : list) {
            wordOccurrences.stream()
                    .filter(w -> w.getName().contains(word))
                    .findFirst()
                    .ifPresentOrElse(x -> x.setCount(x.getCount() + 1),
                            () -> wordOccurrences.add(new Words(word, 1)));
        }
        long result = System.nanoTime() - start;
        System.out.println("Result: " +result);
    }
}