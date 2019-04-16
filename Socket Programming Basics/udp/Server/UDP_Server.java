// my simple UDP server 

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

public class UDP_Server{
	public static void main(String args[]) throws Exception{
		//Step 1
		DatagramSocket socket = new DatagramSocket(1253);
		byte[] buf = new byte[255];
		boolean state = true;
		
		//Step 2
		while(state){
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);

				System.out.println("Client : " + data(buf));

			//Step 3
			if(data(buf).toString().equals("exit")){
				
				System.out.println("Client terminated! Exiting...");
				state = false;
			}

			//Step 4
			buf = new byte[255];
		}
	}
	
	//Step 6
	public static StringBuilder data(byte[] buf){
		int i = 0;
		StringBuilder ret = new StringBuilder();
		if( buf == null)
			return ret = null;
		else{
			while(buf[i] != 0){
				ret.append((char) buf[i]);
				i++;
			}
		}
		return ret;
	}
}
