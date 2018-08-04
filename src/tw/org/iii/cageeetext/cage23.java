package tw.org.iii.cageeetext;

public class cage23 {

	public static void main(String[] args) {
		String s1 = new String(); //只要傳輸都是字串
		byte[] b2 = {99,98,97,96};//字串被創造出來 就不會變更內容
		String s2 = new String(b2);
		String s3 = new String(b2,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1 = new String(b2);//s1的內容被指定到別的字串上了
		String s4 = "cage";//會先在String pool中確認有沒有cage沒有就創造一個
		//並且把他指定給s4
		String s5 = "cage";//String pool已經有一個cage就把同一個cage指定給s5
		//只要有new就會產生一個新的東西
		String s6 = new String(s4);//會在記憶體的某處產生一個新cage且把s6指定給他
		String s7 = new String(s5);//會在記憶體的某處產生一個新cage且把s7指定給他
		int a = 10, b = 10;
		System.out.println(a==b);
		System.out.println(s4 == s5);//只要new出來得東西 == 永遠不會一樣
		System.out.println(s4 == s6);
		System.out.println(s6 == s7);
		System.out.println(s4.equals(s5));//比對字串內容是否相等
		System.out.println(s4.equals(s6));
		System.out.println(s6.equals(s7));
		System.out.println("-------------------");
		s4=s6;
		System.out.println(s4 == s6);
	}

}
