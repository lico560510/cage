package tw.org.iii.cageeetext;

import java.io.FileReader;

public class cage51 {

	public static void main(String[] args) {
		String a = null;
		System.out.println(a);
		
		
		
		try {
		FileReader reader = new FileReader("dir1/cage.txt");
		int v = reader.read();
		System.out.println((char)v);
		}catch(Exception ex) {
			
		}
		
	}

}
