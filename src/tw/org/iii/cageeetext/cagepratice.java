package tw.org.iii.cageeetext;

import javax.swing.JOptionPane;

public class cagepratice {

	public static void main(String[] args) {
		String syear =JOptionPane.showInputDialog("Input the years");
		int year = Integer.parseInt(syear);
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("閏年");//29
				}else {
					System.out.println("不潤");//28
				}
			}else {
				System.out.println("潤年");//29
			}
		}else {
			System.out.println("不潤");//28趙令文老師
		}
	}

}
