package ru.geekbrains.lesson10;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 8080)) {

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
