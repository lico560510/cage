package tw.org.iii.cageeetext;

public class csge24 {

	public static void main(String[] args) {
		Bike b1=new Bike();
		scooter s1=new scooter();
		//Bike s2 =new scooter();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		s1.changeGear(3);
		s1.upSpeed();
		System.out.println(s1.getSpeed());
		//b1.changeGear(3); //改善 Override
	}

}
