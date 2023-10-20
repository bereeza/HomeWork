package org.example.lesson19;

import org.example.lesson19.DBConnector.DataBaseConnection;
import org.example.lesson19.dao.LessonDao;
import org.example.lesson19.entity.Lesson;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/homework";
        String username = "postgres";
        String password = "g8292gwjo";

        // db connect
        DataBaseConnection connection = new DataBaseConnection();
        connection.getConnection(url, username, password);
        LessonDao dao = new LessonDao(connection);

        // create new TEST lesson name, date = 2023-10-20
        // dao.addLesson(new Lesson("TEST", 1));

        // [Lesson(id=4, name=Spring Security, updatedAt=2023-10-17, homework_id=1),
        // Lesson(id=5, name=Machine Learning, updatedAt=2023-10-17, homework_id=2),
        // Lesson(id=6, name=TEST, updatedAt=2023-10-20, homework_id=1),
        // Lesson(id=7, name=TEST, updatedAt=2023-10-20, homework_id=1)]
        // System.out.println(dao.getAllLessons());

        // Lesson(id=4, name=Spring Security, updatedAt=2023-10-17, homework_id=1)
        // System.out.println(dao.getLessonById(4));

        // exception
        // No lesson found. Check id!
        // System.out.println(dao.getLessonById(32535));

        // delete by id
        // dao.deleteLesson(7);
        // [Lesson(id=4, name=Spring Security, updatedAt=2023-10-17, homework_id=1),
        // Lesson(id=5, name=Machine Learning, updatedAt=2023-10-17, homework_id=2),
        // Lesson(id=6, name=TEST, updatedAt=2023-10-20, homework_id=1)]
        // System.out.println(dao.getAllLessons());

        connection.close();
        // exception
        // This connection has been closed.
        System.out.println(dao.getAllLessons());
    }
}
