package classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream output = null;
		ObjectInputStream input = null;
		try {
			while(true){
				//Set server port
				ServerSocket serverSocket = new ServerSocket(3333);
				
				//Create socket
				final Socket socket = serverSocket.accept();
				
				//Create Stream
				output = new ObjectOutputStream(socket.getOutputStream());
				input = new ObjectInputStream(socket.getInputStream());
				
				//Create object serialized
				Student sentStudent = (Student) new Student("SE160171", "Jonas", "Smith", "NewYork");
				
				//Serializing
				output.writeObject(sentStudent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			output.close();
			input.close();
		}
	}
}
