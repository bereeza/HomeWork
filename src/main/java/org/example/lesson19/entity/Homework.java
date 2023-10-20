package org.example.lesson19.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Homework {
    private int id;
    private String name;
    private String description;

    public Homework(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
