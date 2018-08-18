package tw.org.iii.cageeetext;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class cage65 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7778);
			Socket socket = server.accept();
			FileOutputStream fout = new FileOutputStream("dir2/iii.jpg");
			InputStream in = socket.getInputStream();
			int len; byte[] buf = new byte[4096*4096];
			while((len = in.read())!=-1) {
				fout.write(buf,0,len);
			}
			in.close();
			fout.flush();
			fout.close();
			System.out.println("receive ok");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
