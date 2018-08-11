package tw.org.iii.cageeetext;

import java.io.File;
import java.io.IOException;

public class cage45 {

	public static void main(String[] args) {
		File f1 = new File("dir1");
		File f2 = new File("dir2"); //物件一樣會做出來 但不一定會存在列表
		File f3 = new File("dir3/dir4/dir5/dir6");
		File f4 = new File("dir3/dir4/dir5/dir6/file1");
		System.out.println(f1.equals(f4));
		if(f1.exists()) {
			System.out.println("f1 exists");
		}
		if(f3.exists()) {
			System.out.println("f3 exists");
		}else {
			System.out.println(f3.mkdirs());  // 幫他創資料夾
		}
		if(!f4.exists()) {
			try {
			f4.createNewFile();
			}catch(IOException ie) {
				System.out.println(ie);
			}
		}
		
		File f5 = new File("dir1");
		File f6 = new File("dir2/../dir1");
		File f7 = new File("dir3/dir4../../dir1");
		File f8 = new File("dir1");
		System.out.println(f5.getAbsolutePath());
		System.out.println(f6.getAbsolutePath());
		System.out.println(f7.getAbsolutePath());
		System.out.println(f8.getAbsolutePath());
		System.out.println(f5.equals(f8));
	}
}
