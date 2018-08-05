package tw.org.iii.cageeetext;

public class cage29 {//法拉利的例子
	public static void main(String[] args) {
		Brad291 obj1 = new Brad291();
		obj1.m1(); //宣告為Brad291就只能用Brad291方法
		Brad291 obj2 = new Brad292();
		obj2.m1();
		//obj2.m2(); //他把法拉利當成車子 所以不能使用m2方法
		Brad292 obj3 = (Brad292)obj2; //OK
		obj3.m1();
		obj3.m2();
		System.out.println(obj2 == obj3);
		if(obj1 instanceof Brad292){ //obj1是否為Brad292物件
		Brad292 obj4 = (Brad292)obj1; //=>runtimeException
		}else{System.out.println("xx");}
		Brad294 obj5 = new Brad294();
		//Brad292 obj6 = (Brad292)obj5; =>compile error 沒有直系血親所以編譯時期就發生錯誤
	}
}
class Brad291{
	void m1(){System.out.println("Brad291:m1()");}
	}
class Brad292 extends Brad291{
	void m1(){System.out.println("Brad292:m1()");}
	void m2(){}
	}
class Brad293 extends Brad292{void m3(){}}
class Brad294 {}