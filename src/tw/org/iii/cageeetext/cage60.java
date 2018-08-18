package tw.org.iii.cageeetext;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//receive
public class cage60 {
	public static void main(String[] args) {
		byte[] buf = new byte [1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);//0~65535
			DatagramPacket packet = new DatagramPacket(buf,buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			byte[] data = packet.getData();
			int len = packet.getLength();
			InetAddress ip = packet.getAddress();
			System.out.println(new String (data)+":"+len+":"+ip);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
