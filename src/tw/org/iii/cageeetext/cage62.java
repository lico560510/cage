package tw.org.iii.cageeetext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class cage62 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			
			int len;String line;
//			while((line = br.readLine()) =! null){
//			System.out.print(line);
//		}
			server.close();
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
