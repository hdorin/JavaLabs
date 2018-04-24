package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread extends Thread {
	private Socket socket = null;
	private final GameServer server=null;

	// Create the constructor that receives a reference to the server and to the
	// client socket
	public ClientThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket=socket;
		//this.server=server;
		
	}

	public void run() {
		BufferedReader in = null;

		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// client -> server stream
		String request=null;
		try {
			request = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String response = execute(request);
		PrintWriter out = null;
		try {
			out = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // server -> client stream
		out.println(response);
		out.flush();
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ... usse try-catch-finally to handle the exceptions!
	}

	private String execute(String request) {
		return "Server received the request ... ";
		// display the message: "Server received the request ... "
	}
}
