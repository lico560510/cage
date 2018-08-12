package tw.org.iii.cageeetext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class cage57 {

	public static void main(String[] args) {
		Brad573 obj = new Brad573();
		try(ObjectOutputStream ooot =
				new ObjectOutputStream(
						new FileOutputStream("dir1/brad2.object")) ) {
			ooot.writeObject(obj);
			System.out.println("Save OK");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class Brad571 implements Serializable{ //三代皆已序列化
	Brad571(){System.out.println("Brad571()");}
}
class Brad572 extends Brad571{
	Brad572(){System.out.println("Brad572()");}
}
class Brad573 extends Brad572{
	Brad573(){System.out.println("Brad573()");}
}