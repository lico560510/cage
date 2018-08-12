package tw.org.iii.cageeetext;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class cage53 {

	public static void main(String[] args) {
		DataOutputStream dout;
		try {
			dout = new DataOutputStream(
					new FileOutputStream("dir1/cage.dat"));
			dout.writeInt(4);
			dout.writeUTF("Brad");
			dout.writeBoolean(false);
			dout.flush();
			dout.close();
			System.out.println("Save OK");
		} catch (Exception e) {
		}
		
		
	}

}
