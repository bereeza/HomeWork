package org.example.lesson9;

import lombok.*;
import org.example.lesson9.exception.IncorrectBoxException;
import org.example.lesson9.fruits.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add(T t) {
        fruits.add(t);
    }

    public void add(T[] t) {
        Collections.addAll(fruits, t);
    }

    public float getWeight() {
        float weight = 0;
        for (T t : fruits) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> o) {
        if (!(this.hashCode() == o.hashCode())) {
            return getWeight() == o.getWeight();
        } else {
            throw new IncorrectBoxException(
                    "Incorrectly selected box! You can't put into yourself!"
            );
        }
    }

    public void merge(Box<T> o) {
        if (!this.equals(o)) {
            fruits.addAll(o.fruits);
            o.fruits.clear();
        } else {
            throw new IncorrectBoxException(
                    "Incorrectly selected box! You can't put into yourself!"
            );
        }
    }
}
