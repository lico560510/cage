package tw.org.iii.cageeetext;

public class cage20 {

	public static void main(String[] args) { //public跟static交換是OK的
		Bike b1=new Bike(); //可以new表示有宣告
		Bike b2=new Bike();
		System.out.println(b1); //tw.org.iii.cageeetext.Bike@33909752
		//@33909752 記憶體位置
//		float[] a= new float[3];//物件的值是記憶體位置
//		System.out.println(a);
//		int b = 123; //基本型別的值 是值
//		System.out.println(b);
//		b1.upSpeed();
//		System.out.println(b1.speed);
//		System.out.println(b2.speed);
//		b1.downSpeed();
//		System.out.println(b1.speed);
//		System.out.println(b2.speed);
		while(b1.getSpeed()<10) {
			b1.upSpeed();
		}
		System.out.println(b1.getSpeed());
	}
}
