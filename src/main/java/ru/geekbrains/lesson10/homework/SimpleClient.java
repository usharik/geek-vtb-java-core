package ru.geekbrains.lesson10.homework;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleClient {

    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 9090);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scn = new Scanner(System.in)) {

            String msg = "";
            while (!msg.equals("/exit")) {
                System.out.print("Enter message: ");
                msg = scn.nextLine();
                out.writeUTF(msg);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
