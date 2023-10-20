package org.example.lesson19.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.lesson19.DatePicker.DatePicker;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Lesson {
    private int id;
    private String name;
    private Date updatedAt;
    private int homework_id;

    public Lesson(String name, int homework) {
        this.name = name;
        this.homework_id = homework;
        updatedAt = DatePicker.getCurrentDate();
    }
}
