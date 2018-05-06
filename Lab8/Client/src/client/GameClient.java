package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class GameClient {
    private final static String SERVER_ADDRESS = "127.0.0.1";
    private final static int PORT = 8100;


    private PrintWriter out;
    private BufferedReader in;

    GameClient() {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String readFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    void sendRequestToServer(String request) {
        if(request.equalsIgnoreCase("create")) {
            out.println(request);
            out.println(readFromKeyboard());
            out.println(readFromKeyboard());

            String response = "";
            while(!response.equalsIgnoreCase("Congratulation")) {
                out.println(readFromKeyboard());
                out.println(readFromKeyboard());
                try {
                    response = in.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(response);
            }
        }
        out.println(request);
    }

    void getResponse() throws IOException {
        String response = in.readLine();
        System.out.println(response);
    }
}
