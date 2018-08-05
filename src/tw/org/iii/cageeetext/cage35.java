package tw.org.iii.cageeetext;

public class cage35 {

	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		m2(s1);
		m2(s2);
		
	}
	static void m2(Shape s) {
		System.out.println(s.calArea());
	}
}
abstract class Brad353{//是可以的 只是無法直接建構出物件實體
	void m1() {}
}
abstract class Shape {
	Shape(){System.out.println("I am Shape");}
	void setName() {}
	abstract double calLength();
	abstract double calArea();
}
class Circle extends Shape {
	double calLength() {
		return 1.0;
	}
	double calArea(){
		return 1.0;
	}
}
class Rectangle extends Shape {
	double calLength() {
		return 2.0;
	}
	double calArea(){
		return 2.0;
	}
}
//final class Brad351{}
//class Brad352 extends Brad351{}