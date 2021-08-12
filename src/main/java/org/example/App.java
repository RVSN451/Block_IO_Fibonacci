package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static final int PORT = 23566;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String consoleReadString() {
        String line = "";
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public static void main(String[] args) throws IOException {
        Server.server();
    }
}
