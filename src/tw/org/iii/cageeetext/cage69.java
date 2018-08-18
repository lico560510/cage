package tw.org.iii.cageeetext;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class cage69 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.bradchao.com/"); //http = 通訊協定
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while((line = reader.readLine())!= null) {
				System.out.println(line);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
