package tw.org.iii.cageeetext;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class cage63 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.201.102",9999);
			OutputStream out = socket.getOutputStream();
			out.write("".getBytes());
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("OK1");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
