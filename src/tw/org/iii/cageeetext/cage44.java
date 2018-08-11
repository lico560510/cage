package tw.org.iii.cageeetext;

import java.io.File;

public class cage44 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator); // path
		System.out.println(File.separator); //路徑
		//File dir1 = new File("C:\\Users\\user\\text");
		File dir1 = new File("./dir1");
		System.out.println(dir1.exists());
		//System.out.println(dir1.exists());
		File[] roots = File.listRoots();
		for(File root :roots) {
			System.out.println(root.getAbsolutePath());
		}
	}
}
