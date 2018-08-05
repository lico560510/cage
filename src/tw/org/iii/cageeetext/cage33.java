package tw.org.iii.cageeetext;
//父與子載入順序
public class cage33 {

	public static void main(String[] args) {
		//Brad331.m2();
		//Brad331 obj1 = new Brad331();
		Brad332 obj2 = new Brad332(); //new就已經有物件了 建構式只是初始化
		Brad332 obj3 = new Brad332(); //類別整個程式只載入一次
	}
}
class Brad331{
	//建構式只是做初始化的程式 new 的時候物件就有了
	static {System.out.println("Brad331{static}");} //類別會先被載入 1
	{System.out.println("Brad331{}");} //程式區塊 2
	Brad331(){System.out.println("Brad331()");} //建構式初始化程序  3
	void m1(){System.out.println("Brad331:m1");}
	static void m2() {System.out.println("Brad331:m2()");}//不需有物件就能執行
}
class Brad332 extends Brad331{
	static {System.out.println("Brad332{static}");}
	{System.out.println("Brad331{}");}
	Brad332(){System.out.println("Brad332()");}
	void m1(){System.out.println("Brad332:m1");}
	static void m2() {System.out.println("Brad332:m2()");}
}