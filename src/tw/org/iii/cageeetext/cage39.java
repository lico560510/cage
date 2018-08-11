package tw.org.iii.cageeetext;

public class cage39 {

	public static void main(String[] args) {
		Brad391 obj1 = new Brad391();
		Brad391.Brad392 obj2 = obj1.new Brad392();
		obj2.m1();
		Brad391.Brad393 obj3 = new Brad391.Brad393();
		obj2.m1();
	}
}
class Brad391{
	private int a = 10;
	class Brad392{//Brad391的內部類別
		Brad391 m1() {
			System.out.println("Brad391:Brad392:m1()");
			System.out.println(a);
			return Brad391.this;
		}
	}
	//Brad393只是歸類在Brad391下而已
	static class Brad393{  //不需要外部類別物件實體就可以叫出static的物件
		void m1() {
			System.out.println("Brad391:Brad393:m1()");
		}
	}
}