//my  first UDP_Client program
//UDP_Client_1.java
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDP_Client_1{
	public static void main(String args[]) throws IOException{
		Scanner input = new Scanner(System.in);
		byte[] buf = null;
		DatagramSocket socket = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		while(true){
			String message = input.nextLine();
			buf = message.getBytes();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, 1253);
			socket.send(packet);
			if(message.equals("exit"))
				break;
		}
	}
}
