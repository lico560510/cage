package tw.org.iii.cageeetext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//串流 steam
class cage46 {

	public static void main(String[] args) {  // InputStream 永遠是讀byte 所以他不適合讀文字
		try {
			FileInputStream fin = new FileInputStream("dir1/cage.txt");
			
			int temp; byte[] b = new byte[3];
			while((temp = fin.read(b))!=-1) {
				System.out.print(new String(b,0,temp)); //他自己印出換列符號 \r\n
			}
		}catch(FileNotFoundException fe) {}
		catch(IOException fe) {}
	}

}
