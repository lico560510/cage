package tw.org.iii.cageeetext;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class cage68 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://pdfmyurl.com/?url=www.gamer.com.tw"); //http = 通訊協定
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			conn.connect();
			FileOutputStream fout = new FileOutputStream("dir3/game.pdf");
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while((len = bin.read(buf))!= -1) {
				fout.write(buf, 0, len);
			}
			bin.close();
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
