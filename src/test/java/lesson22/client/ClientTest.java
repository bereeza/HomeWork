package lesson22.client;

import org.example.Client;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ClientTest {
    private Client client;

    @Before
    public void setUp() {
        client = new Client();
    }

    @Test
    public void testStartIsCalledOnce() {
        Client mockitoSpyClient = Mockito.spy(client);
        Mockito.doNothing().when(mockitoSpyClient).start(Mockito.anyInt());
        mockitoSpyClient.start(1234);
        Mockito.verify(mockitoSpyClient, Mockito.times(1)).start(1234);
    }
}