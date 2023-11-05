package lesson22.server;

import org.example.Server;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ServerTest {
    private Server server;

    @Before
    public void setUp() {
        server = new Server();
    }

    @Test
    public void testServer() {
        Server mockitoSpyServer = Mockito.spy(server);
        Mockito.doNothing().when(mockitoSpyServer).start(Mockito.anyInt());
        mockitoSpyServer.start(1234);
        Mockito.verify(mockitoSpyServer, Mockito.times(1)).start(1234);
    }

}
