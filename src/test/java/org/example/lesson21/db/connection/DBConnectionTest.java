package org.example.lesson21.db.connection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.Connection;

import static org.junit.Assert.*;

public class DBConnectionTest {
    private DBConnection dbConnection;

    @Before
    public void setUp() {
        dbConnection = new DBConnection();
    }

    @Test
    public void testGetConnection() throws Exception {
        Connection connection = dbConnection.getConnection();
        assertNotNull(connection);
    }
}