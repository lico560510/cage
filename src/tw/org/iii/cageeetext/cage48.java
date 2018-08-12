package tw.org.iii.cageeetext;

import java.io.File;

public class cage48 {

	public static void main(String[] args) {
		File f1 = new File("dir2/cage5.txt");
		File f2 = new File("dir1/cage5.txt");
		if(f1.renameTo(f2)) {   // 換爸爸=剪下貼上
			System.out.println("OK");
		}else {
			System.out.println("false");
		}
	}
}
