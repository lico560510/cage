package tw.org.iii.cageeetext;

public class cage42 {

	public static void main(String[] args) {
		m1();
	}
		static void m1(){
		int a = 10 ,b = 3;
		try {
			System.out.println(a/b);
			return;
		}catch(Exception e) { //可以沒有catch
			System.out.println("OK");
			return;
		}finally {  //無論如何都會做
			System.out.println("OK2");
		}
		//System.out.println("OK3");
	}
}
