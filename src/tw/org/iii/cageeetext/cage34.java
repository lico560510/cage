package tw.org.iii.cageeetext;
//強迫多型
public class cage34 {
	public static void main(String[] args) {
		//Brad341 obj1 = new Brad341(); 抽象類別無法"直接"宣告出物件實體
		Brad341 obj1 = new Brad342();
		Brad341 obj2 = new Brad343();
		obj1.m2();
		obj2.m2();
		
	}
}
abstract class Brad341{//抽象類別
	void m1() {System.out.println("Brad341:m1()");}
	abstract void m2();//有定義而無實作的方法 強迫讓子類別繼承多型
}
class Brad342 extends Brad341{
	void m2() {System.out.println("Brad342:m2()");}
}
class Brad343 extends Brad341{
	void m2() {System.out.println("Brad343:m2()");}
}
