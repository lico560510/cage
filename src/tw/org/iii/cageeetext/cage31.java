package tw.org.iii.cageeetext;

public class cage31 {
	public static void main(String[] args) {
		Brad311 obj1 = new Brad311();
		byte a = 1, b = 2;
		obj1.m1(a,(int)b); //混淆不清
	}
}
class Brad311{
	void m1(byte a) {
		System.out.println("A");
	}
	void m1(byte a, int b) {
		System.out.println("B");
	}
	void m1(int a, byte b) {
		System.out.println("C");
	}
//	void m1(byte a, byte b) {
//		System.out.println("C");
//	}
}