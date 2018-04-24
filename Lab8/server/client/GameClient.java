package lab8c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class GameClient {
    private final static String SERVER_ADDRESS = "127.0.0.1";
    private final static int PORT = 8100;


    public static void main(String[] args) throws IOException {
        GameClient client = new GameClient();
        while (true) {
            String request = client.readFromKeyboard();
            if (request.equalsIgnoreCase("exit")) {
                client.sendRequestToServer("exit");
                break;
            } else {
                client.sendRequestToServer(request);
            }
        }
    }

    //Implement the sendRequestToServer method
    private void sendRequestToServer(String request) {

        try {
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println(request);

            String response = in.readLine();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String readFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
