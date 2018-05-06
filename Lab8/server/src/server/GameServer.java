package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

class GameServer {
    private static final int PORT = 8100;
    private ServerSocket serverSocket;
    private boolean running = false;


    void init() {
        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        running = true;
    }

    void waitForClients(GameServer server) {
        while (running) {

            System.out.println("Waiting for a client ...");

            Socket socket;
            try {
                socket = serverSocket.accept();
                System.out.println("client accepted, socket is: " + socket);
                new ClientThread(socket, server).start();

            }
            catch (SocketException e){
                System.out.println("Server is shutdown. Goodbye !!!");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void stop() throws IOException {
        this.running = false;
        serverSocket.close();
    }

}