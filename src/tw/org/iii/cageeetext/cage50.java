package tw.org.iii.cageeetext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class cage50 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File sourse = new File("dir1/724403.jpg");
		final int buflimit = 2000000000;
		byte[] buf = new byte[sourse.length()<buflimit?(int)sourse.length():buflimit];
		try {
			FileInputStream fin = new FileInputStream(sourse);
			FileOutputStream fout = new FileOutputStream("dir2/724403.jpg");
			int len = 0;
			while((len = fin.read(buf))!=-1) {
				fout.write(buf, 0, len);//只能2G
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("OK"+(System.currentTimeMillis()-start));
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
