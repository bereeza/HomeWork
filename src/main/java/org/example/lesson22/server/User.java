package org.example.lesson22.server;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.net.Socket;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class User {
    private static long USER_COUNTER = 1;
    private long id;
    private String name;
    private LocalDateTime time;
    private Socket userSocket;

    public User(Socket socket) {
        this.id = USER_COUNTER++;
        this.name = "client_" + id;
        this.time = LocalDateTime.now();
        this.userSocket = socket;
    }
}
