package tw.org.iii.cageeetext;

public class cage11 {

	public static void main(String[] args) {
		byte a =11;
		final byte c=100;
		switch (a) {
		case 1:
			System.out.println("a");
			break;
		default://switch 先看case再看default
			System.out.println("x"); 
		case 10:
			System.out.println("b");
			break;
		case c-91:
			System.out.println("c");
			break;
		/*case 1000:  // 超過byte最大值
			System.out.println("a"); 
			break;*/
	}
}
}