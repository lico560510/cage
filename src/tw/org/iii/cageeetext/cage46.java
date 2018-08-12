package tw.org.iii.cageeetext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//串流 steam
class cage46 {

	public static void main(String[] args) {  // InputStream 永遠是讀byte 所以他不適合讀文字
		try {
			File sourse = new File("dir1/cage.txt");
			FileInputStream fin = new FileInputStream(sourse);
			byte[] b = new byte[(int)sourse.length()];
			fin.read(b);
				System.out.print(new String(b)); //他自己印出換列符號 \r\n
		}catch(FileNotFoundException fe) {}
		catch(IOException fe) {}
	}

}
