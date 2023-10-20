package org.example.lesson19.SQLQueryConstant;

public class SQLQuery {
    public static final String ADD_LESSON = "INSERT INTO lesson (name, updatedAt, homework_id) VALUES (?, ?, ?);";
    public static final String DELETE_LESSON_BY_ID = "DELETE FROM lesson WHERE id = ?";
    public static final String GET_ALL_LESSONS = "SELECT * FROM lesson";
    public static final String GET_LESSON_BY_ID = "SELECT * FROM lesson WHERE id = ?";
}
