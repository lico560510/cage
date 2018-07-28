package pratice;

public class pratice {
	public static void main(String[] args) {
		int[] poker = new int [52];
		int temp;
		for(int j=0;j<poker.length;j++) {
			poker[j]=j;
		}
		for(int i=poker.length;i>3;i--) {
			int choose = (int)(Math.random()*i);
			temp=poker[choose];
			poker[choose]=poker[i-1];
			poker[i-1]=temp;
		}
		for(int i=0;i<poker.length;i++) {
			System.out.println(poker[i]);
		}
	}
}
