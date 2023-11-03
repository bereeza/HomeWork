package org.example.lesson21.db;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class DBStorageTest {
    private DBStorage dbStorage;
    private final Connection connection = Mockito.mock(Connection.class);

    private final PreparedStatement preparedStatement = Mockito.mock(PreparedStatement.class);

    @Before
    public void setUp() {
        dbStorage = new DBStorage();
        dbStorage.setConnection(connection);
    }

    @Test
    public void testStringStore() throws Exception {
        String data = "testData";
        Mockito.when(connection.prepareStatement(Mockito.anyString())).thenReturn(preparedStatement);
        dbStorage.store(data);
        Mockito.verify(preparedStatement).execute();
    }

    @Test
    public void testListStore() throws Exception {
        List<String> data = List.of("data1", "data2", "data3");
        Mockito.when(connection.prepareStatement(Mockito.anyString())).thenReturn(preparedStatement);
        dbStorage.store(data);
        Mockito.verify(preparedStatement, Mockito.times(data.size())).execute();
    }
}
