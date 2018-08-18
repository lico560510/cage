package tw.org.iii.cageeetext;

public class cage70 {

	public static void main(String[] args) {
		int a = 10;//a是基本型別 非物件
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		Integer d = 10;//auto-boxing
		System.out.println(a+3);
		System.out.println(b+4); //unWrapper auto-un-boxing
		System.out.println(c+5);
		System.out.println(d+6);
		System.out.println(a==b);
		System.out.println(b==c); //比的是物件
		System.out.println(b==d); //比的是物件
		System.out.println(a==c);
		System.out.println(a==d);
		
		System.out.println(b.equals(a));//a autoboxing 成物件
	}
}
