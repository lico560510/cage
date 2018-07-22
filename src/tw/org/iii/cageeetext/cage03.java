package tw.org.iii.cageeetext;

public class cage03 {

	public static void main(String[] args) {
		float f1=1.2f;//1.2=>double ; 12=>int
		double d1=12.3;
		f1++;
		System.out.println(f1);
		f1+=10;
		System.out.println(f1);
		int a1 =10;
		float a2 = a1+f1; //int+float=>float
		long a3=10;
		float a4=a3+f1; //long+float=>float

	}

}
