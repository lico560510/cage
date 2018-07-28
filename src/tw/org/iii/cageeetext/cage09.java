package tw.org.iii.cageeetext;

public class cage09 {

	public static void main(String[] args) {
		int a = 10, b =3;
	  //if (a++>=10||b--<=3) {  //print a=11 b=3 前式已滿足
	  //if (++a>=10&&--b<=3) {  //print a=11 b=2 前式已滿足
		if (--a>=10&--b<=3) {
			System.out.println("OK:"+a+";b ="+b);
		}else {
			System.out.println("XX:"+a+";b ="+b);
		}
		System.out.println(3&2); //二進位運算
		System.out.println(3|2); //二進位運算
		System.out.println(3^2); //XOR運算 
		System.out.println("-------------");
		if(a>=10) ;{
		}
	}
}