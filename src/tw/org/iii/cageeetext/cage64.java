package tw.org.iii.cageeetext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class cage64 {

	public static void main(String[] args) {
		//read local file 
		//sand tcp data
		try {
			File file= new File("dir1/724403.jpg");
			byte[] buf = new byte[(int)file.length()];
			new FileInputStream(file).read(buf);
			
			Socket socket = new Socket("192.168.201.163",7778);
			
			OutputStream out = socket.getOutputStream();			
			out.flush();
			out.close();
			socket.close();
			System.out.println("OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
