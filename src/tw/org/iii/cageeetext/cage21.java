package tw.org.iii.cageeetext;

public class cage21 {

	public static void main(String[] args) {
		Bike b1,b2;
		b1 = new Bike(); //new就直接new出來了一個記憶空間
		System.out.println(b1.getSpeed());
		b2 = new Bike(1.5);
		System.out.println(b2.getSpeed());
		b1.upSpeed(4);
		b2.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
	}
}
