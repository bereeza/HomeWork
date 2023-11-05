package org.example.lesson22;

import org.example.Client;
import org.example.Server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.start(1234);

        //Client client = new Client();
        //client.start(1234);
    }
}
