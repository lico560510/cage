package tw.org.iii.cageeetext;

public class pokerv3 {
	public static void main(String[] args) {
		int[] poker = new int [52];
		int temp;
		for(int j=0;j<poker.length;j++) {
			poker[j]=j;
		}
		for(int i=poker.length;i>3;i--) {
			int choose = (int)(Math.random()*i);
//			System.out.println(poker[choose]);
//			System.out.println(poker[i-1]);
//			System.out.println("-------------------");
//			poker[choose]=poker[choose]+poker[i-1];
//			System.out.println(poker[choose]);
//			System.out.println(poker[i-1]);
//			System.out.println("-------------------");
//			poker[i-1]=poker[choose]-poker[i-1];
//			System.out.println(poker[choose]);
//			System.out.println(poker[i-1]);
//			System.out.println("-------------------");
//			poker[choose]=poker[choose]-poker[i-1];
//			System.out.println(poker[choose]);
//			System.out.println(poker[i-1]);
//			System.out.println("-------------------");
			temp=poker[choose];
			poker[choose]=poker[i-1];
			poker[i-1]=temp;
		}
		for(int i=0;i<poker.length;i++) {
			System.out.println(poker[i]);
		}
	}
}