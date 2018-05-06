package client;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GameClient client = new GameClient();
        while (true) {
            String request = client.readFromKeyboard();
            if (request.equalsIgnoreCase("exit")) {
                client.sendRequestToServer("exit");
                break;
            } else {
                client.sendRequestToServer(request);
            }

            try {
                client.getResponse();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}