package tw.org.iii.cageeetext;

import java.util.Arrays;

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
			//System.out.println(poker[i]);
		}
		
	System.out.println("------------------------");
	int[][] players=new int[4][13];
	for(int i=0;i<poker.length;i++) {
		players[i%4][i/4]=poker[i]; //畫表格
	}
	
	String[] color= {"黑桃","紅心","方塊","梅花"};
	String[] value= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	for(int []player:players) {
		Arrays.sort(player); //排序
		for(int card:player) {
			System.out.print(color[card/13]+value[card%13]+" ");
		}
		System.out.println();
	}
	}
}
