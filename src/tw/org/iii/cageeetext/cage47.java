package tw.org.iii.cageeetext;
import java.io.FileOutputStream;
import java.io.IOException;

public class cage47 {
	public static void main(String[] args) {
		try {//如果檔案不存在 就創一個  如果檔案在 清空先 再寫入
			 //使用者要對他有寫入權限
			FileOutputStream fout = new FileOutputStream("dir1/cage3.txt",true);
			fout.write("123Hello,word\n".getBytes());
			fout.write("Hello,word\n".getBytes());
			fout.write("Hello,word\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(IOException ie) {
			System.out.println(ie);
		}
	}
}
