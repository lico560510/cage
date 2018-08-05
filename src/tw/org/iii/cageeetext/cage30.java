package tw.org.iii.cageeetext;

public class cage30 {

	public static void main(String[] args) {
		Brad302 obj1 = new Brad302();
		byte b1 = 2;
		obj1.m1(b1);
		//Brad301 obj2 = new Brad301();
		//obj2.sayYa("sam","cage");
		Brad301 obj3 = new Brad301();
		obj3.m1(1,2,3);
	}
}
class Brad301{       //override要第一行全都一樣
	int m1(int a) {  //子類別return值要比父類別範圍大 存取修是字要大於或等於爸爸
		System.out.println("A");
		return 1;
	}
void m1(int a,int b) { //兩個m1為overload
		System.out.println("A2");
	}
void m1(int...as) {
		System.out.println("A3");
	}
//void m1(int[] names) {  //上下兩個水火不容 所以下面的子類別直接override
//	System.out.println("A3");
//}
//void sayYa(String[] names) {
//for(String name: names) {
//	System.out.println(name+",Ya!");
//}
//}
//不定個數參數最多只能有一組 而且在最後面
//void sayYa(String...names) { 
//for(String name: names) {
//	System.out.println(name+",Ya!");
//}
//}
}

class Brad302 extends Brad301{
	String m1(byte a) {
		System.out.println("b");
		return "a";
	}
	void m1(int[] names) {           //他overridevoid m1(int...as)
		System.out.println("A3");
	}
}
