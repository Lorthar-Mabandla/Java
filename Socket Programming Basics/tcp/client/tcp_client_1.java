//tcp_client_1.java
import java.net.*;
import java.io.*;

public class tcp_client_1{
	public static void main(String args[]) throws IOException{
		Socket socket = new Socket("localhost", 5000);
		InputStream input_stream = socket.getInputStream();
		DataInputStream data_input_stream = new DataInputStream(input_stream);
		String message = new String(data_input_stream.readUTF());
		System.out.println(message);
		data_input_stream.close();
		input_stream.close();
		socket.close();
	}
}
