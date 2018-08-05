package tw.org.iii.cageeetext;

public class cage27 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		String str1 = new String("Bard");
		System.out.println(str1);
		cage271 obj1 = new cage271();
		System.out.println(obj1);
		cage271 obj2 = new cage271();
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}
	}
class cage271{
	@Override
	public String toString() {
		return "Brad";
	}
}
