package org.example.lesson19.dao;

import lombok.Getter;
import lombok.Setter;
import org.example.lesson19.DBConnector.DataBaseConnection;
import org.example.lesson19.SQLQueryConstant.SQLQuery;
import org.example.lesson19.entity.Lesson;
import org.example.lesson19.exception.NoLessonFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class LessonDao {

    private Connection connection;

    public LessonDao(DataBaseConnection connection) {
        this.connection = connection.getConnection();
    }

    public void addLesson(Lesson lesson) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.ADD_LESSON)) {
            preparedStatement.setString(1, lesson.getName());
            preparedStatement.setDate(2, lesson.getUpdatedAt());
            preparedStatement.setInt(3, lesson.getHomework_id());
            preparedStatement.execute();
        }
    }

    public void deleteLesson(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.DELETE_LESSON_BY_ID)) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        }
    }

    public List<Lesson> getAllLessons() throws SQLException {
        List<Lesson> lessons = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(SQLQuery.GET_ALL_LESSONS)) {
                while (resultSet.next()) {
                    lessons.add(new Lesson(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getDate("updatedAt"),
                            resultSet.getInt("homework_id")));
                }
            }
        }
        return lessons;
    }

    public Lesson getLessonById(int id) throws SQLException {
        Optional<Lesson> lesson = Optional.empty();

        try (PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.GET_LESSON_BY_ID)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    lesson = Optional.of(new Lesson(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getDate("updatedAt"),
                            resultSet.getInt("homework_id")
                    ));
                }
            }
        }
        return lesson.orElseThrow(() -> new NoLessonFoundException("No lesson found. Check id!"));
    }
}