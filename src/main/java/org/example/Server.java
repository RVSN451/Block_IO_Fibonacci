package org.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void server() throws IOException {

        ServerSocket servSocket = new ServerSocket(App.PORT);

        while(true){
            try (Socket socket = servSocket.accept();
                 PrintWriter serverOut = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader serverIn = new BufferedReader(new
                         InputStreamReader(socket.getInputStream()))) {

                String line;
                do {
                    serverOut.println("Введите номер члена ряда фибоначи,который Выхотите вычислить. Для выхода введите 0.");
                    line = serverIn.readLine();
                    if (Integer.parseInt(line) == 0){
                        serverOut.println("Работа программы завершена.");
                        break;
                    } else serverOut.printf("Значение %d-го члена ряда Фибаначи равно: %d\n",
                            Integer.parseInt(line),  Fibonacci.myFibonacci(Integer.parseInt(line)));

                } while (!line.equals("0"));

            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }
}





