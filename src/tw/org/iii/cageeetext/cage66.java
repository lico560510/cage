package tw.org.iii.cageeetext;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;
//https://opendata-contest.tca.org.tw/announcement3.aspx
public class cage66 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx"); //http = 通訊協定
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream()));
			String line;
			StringBuffer sb = new StringBuffer();
			while((line = reader.readLine())!= null) {
				sb.append(line);
				System.out.println(line);
			}
			reader.close();
			parseJSON(sb.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//到網路上找可以讀JSON的程式碼並匯入同個package
	private static void parseJSON(String json) {
		try {
		JSONArray root = new JSONArray(json);
		System.out.println(root.length());
		for(int i=0;i<root.length();i++) {
			JSONObject obj = root.getJSONObject(i);
			String name = obj.getString("Name");
			String addr = obj.getString("Address");
			String  tel = obj.getString("Tel");
			System.out.println(name+addr+tel);
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
