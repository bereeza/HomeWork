package org.example.lesson21.db;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.example.lesson21.db.SQLQuery.SQLQuery;
import org.example.lesson21.db.connection.DBConnection;
import org.example.lesson21.factory.Storage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Getter
@Setter
public class DBStorage implements Storage {
    private Connection connection;

    @SneakyThrows
    public DBStorage() {
        connection = DBConnection.getConnection();
    }

    @Override
    @SneakyThrows
    public void store(String data) {
        addByQuery(data);
    }

    @Override
    @SneakyThrows
    public void store(List<String> data) {
        for (String datum : data) {
            addByQuery(datum);
        }
    }

    private void addByQuery(String datum) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(SQLQuery.ADD_MSG)) {
            statement.setString(1, datum);
            statement.execute();
        }
    }
}
