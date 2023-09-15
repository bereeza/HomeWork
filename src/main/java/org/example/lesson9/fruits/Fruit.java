package org.example.lesson9.fruits;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Fruit extends FruitWeightGenerator {
    private float weight;

    public Fruit(float min, float max) {
        this.weight = generateNum(min, max);
    }

    @Override
    public Float generateNum(Float min, Float max) {
        return new FruitWeightGenerator().generateNum(min, max);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Float.compare(weight, fruit.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}