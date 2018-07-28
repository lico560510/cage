package tw.org.iii.cageeetext;

public class pokerv2 {

	public static void main(String[] args) {
		int[] poker = new int [52];
		boolean isRepeat = false;
		int temp;
		for(int i=0;i<poker.length;i++) {
			do {
			temp = (int)(Math.random()*52);
			//檢查機制
			isRepeat = false;
			for(int j=0;j<i;j++) {
				if(poker[j]==temp) {
					isRepeat = true;
					break;
				}
			}
			}while(isRepeat);
			poker[i] = temp;
			System.out.println(poker[i]);
		}
	}
}
