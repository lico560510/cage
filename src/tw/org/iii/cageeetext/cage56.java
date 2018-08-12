package tw.org.iii.cageeetext;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class cage56 {
	public static void main(String[] args) {
		try(ObjectInputStream oin =
				new ObjectInputStream(
						new FileInputStream("dir1/brad.object"))){
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			System.out.println(s1.calAvg());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
