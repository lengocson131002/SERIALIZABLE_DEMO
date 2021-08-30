package classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//Creating socket
		final Socket socket = new Socket("127.0.0.1", 3333);
		
		//Creating stream
		ObjectOutputStream output = null;
		ObjectInputStream input = null;
		output = new ObjectOutputStream(socket.getOutputStream());
		input = new ObjectInputStream(socket.getInputStream());
		
		try {
			//Deserializing
			Student receivedStudent = (Student) input.readObject();
			System.out.println(receivedStudent);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
