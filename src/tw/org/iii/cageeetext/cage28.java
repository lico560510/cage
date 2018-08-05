package tw.org.iii.cageeetext;

public class cage28 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		StringBuffer sb2 = sb1.append("123456789012345");
		System.out.println("sb1"+sb1);
		System.out.println("sb1"+sb1.capacity());
		System.out.println("sb1"+sb1.length());
		System.out.println("sb2"+sb2);
		System.out.println("sb2"+sb2.capacity());
		System.out.println("sb2"+sb2.length());
		System.out.println(sb1 == sb2);
		
		sb1.append("6");
		System.out.println("sb1"+sb1);
		System.out.println("sb1"+sb1.capacity());
		System.out.println("sb1"+sb1.length());
		sb1.append("7");
		System.out.println("sb1"+sb1);
		System.out.println("sb1"+sb1.capacity());
		System.out.println("sb1"+sb1.length());
		
		//append完就會自動return自己
		sb1.append("8")
		.replace(0,3,"brad")
		.append("OK");
		System.out.println("sb1"+sb1);
		System.out.println("sb1"+sb1.capacity());
		System.out.println("sb1"+sb1.length());
		cage281 obj1 = new cage281();
		System.out.println(obj1.calSum());
		obj1.setS1(12).setS2(34).setS3(48);
		System.out.println(obj1.calSum());
		
		StringBuffer sb3 = new StringBuffer("Bard");
		StringBuffer sb4 = new StringBuffer("Bard");
		System.out.println(sb3.equals(sb4)); // no override => same as ==
		System.out.println(sb3.toString().equals(sb4.toString()));
		System.out.println(sb3.toString().equals(sb4));
		//StringBuffer must toString to "String"
	}

}
class cage281 {
	int s1,s2,s3;
	cage281 setS1(int s1){this.s1=s1;return this;}
	cage281 setS2(int s2){this.s2=s2;return this;}
	cage281 setS3(int s3){this.s3=s3;return this;}
	int calSum() {return s1+s2+s3;}
}