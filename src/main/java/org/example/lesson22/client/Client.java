package org.example.lesson22.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void start(int port) {
        try (Socket socket = new Socket("localhost", port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            Thread messageThread = sendResToServer(writer);
            Thread responseThread = listenServerRes(reader);

            messageThread.start();
            responseThread.start();

            messageThread.join();
            responseThread.join();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Thread sendResToServer(PrintWriter writer) {
        Thread sendRes = new Thread(() -> {
            String input;
            Scanner scanner = new Scanner(System.in);

            while (true) {
                input = scanner.nextLine();
                if (input.equals("-exit")) {
                    System.exit(0);
                } else if (input.startsWith("-file ")) {
                    sendFileData(input, writer);
                } else {
                    writer.println(input);
                }
            }
        });
        return sendRes;
    }

    private Thread listenServerRes(BufferedReader reader) {
        Thread serverRes = new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = reader.readLine()) != null) {
                    System.out.println(serverMessage);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        return serverRes;
    }

    private void sendFileData(String input, PrintWriter writer) {
        String filePath = input.substring("-file ".length());
        try {
            File file = new File(filePath);
            writer.println("-file " + file.getName());
            try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    writer.println(line);
                }
                writer.println("stop");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

