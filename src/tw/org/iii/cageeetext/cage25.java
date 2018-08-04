package tw.org.iii.cageeetext;

public class cage25 {

	public static void main(String[] args) {
		cage251 c1 = new cage251(2);
		//cage251 c2 = new cage251();
		cage252 c2 = new cage252();
		cage251 c3 = new cage251(2);
		System.out.println(c1.equals(c3));
		//String 在 Method 的是改寫父類別
		System.out.println(c1 == c3);
		System.out.println(c1.isSame(c3));
	}
}
//所有類別都會有建構式 沒寫就是父類別無傳參數建構式為預設建構式
//如果有類別定義出來就不會再使用父類別無傳參數建構式
//類別建構式第一行若不寫 super() 或  this() 就默認是 super()
class cage251 { 
	private int a;
	cage251(int a){
		//super();//默認第一道敘述為呼叫父類別無傳參數建構式 但定義之後 就不會super
		//只要有一個類別 他的祖宗八代都會在
		this.a = a;
		System.out.println("cage251()");
	}
	public int getA() {return a;}
	@Override //不寫也沒差
	public boolean equals(Object obj) { //存取修飾字要比父類別大
		return ((cage251)obj).getA() == a;
	}
	public boolean isSame(Object obj) {
		return ((cage251)obj).getA() == a;
	}
}
class cage252 extends cage251{
	cage252(){
		//super();
		super(3);
	}
}
class cage253 extends cage252{
	
}