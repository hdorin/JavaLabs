package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread {
	private Socket socket = null;
	private final GameServer server;

	// Create the constructor that receives a reference to the server and to the
	// client socket
	public ClientThread(Socket socket2) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		BufferedReader in;

		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// client -> server stream
		String request;
		try {
			request = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String response = execute(request);
		PrintWriter out = new PrintWriter(socket.getOutputStream()); // server -> client stream
		out.println(response);
		out.flush();
		socket.close(); // ... usse try-catch-finally to handle the exceptions!
	}

	private String execute(String request) {
		// display the message: "Server received the request ... "
	}
}
