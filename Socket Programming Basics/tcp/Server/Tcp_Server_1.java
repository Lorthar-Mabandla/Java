//my first tcp server
//Tcp_Server_1.java

//import .io & .net packages
import java.net.*;
import java.io.*;

public class Tcp_Server_1 {
	//open main method that throws IOException
	public static void main(String args[]) throws IOException{
		//declare ServerSocket and assign port number
		ServerSocket server_socket = new ServerSocket(5000);
		//declare socket to accepts connection from Server (ServerSocket)
		Socket socket = server_socket.accept();
		//associate communication stream with socket
		//declare OutputStream 
		OutputStream output_stream = socket.getOutputStream();
		DataOutputStream data_output_stream = new DataOutputStream(output_stream);
		String message = "Hello";
		data_output_stream.writeUTF(message);
		data_output_stream.close();
		output_stream.close();
		socket.close();
	}
}
