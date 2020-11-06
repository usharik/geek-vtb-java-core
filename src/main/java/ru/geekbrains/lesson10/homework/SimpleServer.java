package ru.geekbrains.lesson10.homework;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9090)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> newClientThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void newClientThread(Socket socket) {
        try (DataInputStream inp = new DataInputStream(socket.getInputStream())) {
            String msg = "";
            while (!msg.equals("/exit")) {
                msg = inp.readUTF();
                System.out.println(msg);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
