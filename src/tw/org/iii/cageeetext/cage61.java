package tw.org.iii.cageeetext;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
// is UDP send
public class cage61 { //is P2P

	public static void main(String[] args) {
		byte[] buf = "Hello World".getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf,buf.length
					,InetAddress.getByName("192.168.201.105"),8890);
			socket.send(packet);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
