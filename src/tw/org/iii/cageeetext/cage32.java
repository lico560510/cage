package tw.org.iii.cageeetext;

public class cage32 {
	public static void main(String[] args) {
		
	}
}
class Brad321{
	void m1() {
		System.out.println("Brad321:m1()");
	}
}
class Brad322 extends Brad321{   //override 先做完爸爸的再來做改良 覆蓋=!取代
	void m1() {
		super.m1();
		System.out.println("Brad322:m1()");
	}
}