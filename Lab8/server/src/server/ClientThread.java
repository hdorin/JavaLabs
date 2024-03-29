package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ClientThread extends Thread {
    private Socket socket;
    private final GameServer gameServer;

    private BufferedReader in;
    private PrintWriter out;

    ClientThread(Socket socket, GameServer gameServer) throws SocketTimeoutException, IOException {

        this.gameServer = gameServer;
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        this.socket.setSoTimeout(10000);

    }

    public void run() {
        //client -> server stream


        String request = "";
        while (!request.equals("exit")) {
            try {
                request = in.readLine();
                if (request.equalsIgnoreCase("create")) {
                    System.out.println("command create");
                    String player = in.readLine();
                    System.out.println("player = " + player);
                    Integer maxNumber = Integer.valueOf(in.readLine());
                    System.out.println("maxNumber = " + maxNumber);
                    GuessingGame guessingGame = new GuessingGame(player, maxNumber);
                    guessingGame.startGuessingGame(in, out);
                }
            }
            catch (SocketTimeoutException e){
                System.out.println("timeout exception");
                try {
                    gameServer.stop();
//                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            String response = execute(request);
            //server -> client stream

            out.println(response);
        }

        try {
            gameServer.stop();
            socket.close(); //... use try-catch-finally to handle the exceptions!

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String execute(String request) {
        return "Server received the request ... " + request;
    }
}