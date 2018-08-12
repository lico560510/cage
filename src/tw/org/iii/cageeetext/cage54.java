package tw.org.iii.cageeetext;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class cage54 {

	public static void main(String[] args) {
		try(DataInputStream din = 
			new DataInputStream(
				new FileInputStream("dir1/cage.dat"))) {
			
			int stage = din.readInt();
			String username = din.readUTF();
			boolean isSound = din.readBoolean();
			System.out.println(stage);
			System.out.println(username);
			System.out.println(isSound);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
