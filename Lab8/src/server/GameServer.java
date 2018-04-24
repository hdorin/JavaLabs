package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GameServer {
    private static final int PORT = 8100;
    private ServerSocket serverSocket;
    private boolean running = false;

    public static void main(String[] args)  {
        GameServer server = new GameServer();
        server.init();
        server.waitForClients(); //... handle the exceptions!
    }
    ... // Implement the init() method: create the serverSocket and set running to true
    ... // Implement the waitForClients() method: while running is true, create a new socket for every incoming client and start a ClientThread to execute its request.
	
    private void waitForClients() {
		// TODO Auto-generated method stub
    	while (running==true) {
    		System.out.println ("Waiting for a client ...");
    		Socket socket = serverSocket.accept();
    		// Execute the client's request in a new thread
    		new ClientThread(socket).start();
    	}
		
	}
	private void init() {
		// TODO Auto-generated method stub
		serverSocket = new ServerSocket(PORT);
		running=true;
	}
	public void stop() throws IOException {
        this.running = false;
        serverSocket.close();
    }	
}