package org.example.lesson19.DBConnector;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@NoArgsConstructor
public class DataBaseConnection {

    private Connection connection;

    public void getConnection(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void close() throws SQLException {
        connection.close();
    }
}
