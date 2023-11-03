package org.example.lesson21.db.connection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@NoArgsConstructor
public class DBConnection implements AutoCloseable {
    private Connection connection;
    private static final String URL = "jdbc:postgresql://localhost:5432/homework";
    private static final String USER = "postgres";
    private static final String PASSWORD = "g8292gwjo";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    @Override
    public void close() throws SQLException {
        DriverManager.getConnection(URL, USER, PASSWORD).close();
    }
}
