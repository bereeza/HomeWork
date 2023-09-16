package org.example.lesson11.task2;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Words {
    private String name;
    private int count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return Objects.equals(name, words.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
