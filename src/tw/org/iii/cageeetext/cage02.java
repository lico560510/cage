package tw.org.iii.cageeetext;

public class cage02 {

	public static void main(String[] args) {
		int a1=10 , a2=3;
		int a3=a1/a2; //結果是整數
		System.out.println(a3);
		byte b1=10 , b2=3;
		byte b3=(byte)(b1/b2); //強調byte
		System.out.println(b3); //sysout alt+/
		byte b4=10+3;
		byte b5=127;
		b5++;// 位元運算
		System.out.println(b5);
		b5--;
		System.out.println(b5);
		b5+=4;
		System.out.println(b5);
		b5-=4;
		System.out.println(b5);
		//b5=b5+1;
		
	}

}