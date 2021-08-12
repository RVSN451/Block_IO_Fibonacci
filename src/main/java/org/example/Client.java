package org.example;

import java.io.*;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try (Socket clientSocket = new Socket("127.0.0.1", App.PORT);
             PrintWriter clientOut = new
                     PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader clientIn = new BufferedReader(new
                     InputStreamReader(clientSocket.getInputStream()))) {



            while (true) {
                String resp;
                System.out.println(clientIn.readLine());


                String choice = App.consoleReadString();
                if (choice.equalsIgnoreCase("0")) {
                    clientOut.println(choice);
                    resp = clientIn.readLine();
                    System.out.println(resp);
                    break;
                } else {
                    clientOut.println(choice);
                    System.out.println(clientIn.readLine());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
