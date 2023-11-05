package org.example.lesson22.server;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Server {
    private static List<User> usersList = new ArrayList<>();
    private static List<PrintWriter> clientWriters = new ArrayList<>();
    private static final String STORAGE_PATH = "C:\\Users\\User\\IdeaProjects\\";

    public void start(int port) {
        try (ServerSocket server = new ServerSocket(port)) {
            while (true) {
                Socket socket = server.accept();
                User user = new User(socket);
                usersList.add(user);
                notifyAllUsers(socket, "New user! " + user.getName());
                System.out.println("New user! " + user.getName());

                writeToFile(user);
                sendFromServer(socket);
                startListening(user, socket);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void startListening(User user, Socket socket) {
        new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                String msg;
                while ((msg = reader.readLine()) != null) {
                    if (msg.startsWith("-file ")) {
                        getFileFromUSer(user, msg, reader);
                    } else {
                        System.out.println("[" + user.getName() + "] " + msg.trim());
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Goodbye! " + user.getName() + " left.");
                usersList.remove(user);
            }
        }).start();
    }

    private static void getFileFromUSer(User user, String msg, BufferedReader reader) {
        String fileName = msg.substring("-file ".length());
        File file = new File(STORAGE_PATH + fileName);
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("stop")) {
                    break;
                }
                fileWriter.write(line);
                fileWriter.newLine();
            }
            System.out.println("File received from " + user.getName() + ": " + fileName);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static void sendFromServer(Socket socket) {
        new Thread(() -> {
            try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                clientWriters.add(writer);
                Scanner scanner = new Scanner(System.in);
                String s;
                while (true) {
                    s = scanner.nextLine();
                    notifyAllUsers(socket, "[SERVER]: " + s);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private static void notifyAllUsers(Socket socket, String message) {
        synchronized (socket) {
            clientWriters.forEach(writer -> writer.println(message));
        }
    }

    private static void writeToFile(User user) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("users.txt", true))) {
            writer.println(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
