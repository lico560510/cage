package tw.org.iii.cageeetext;

public class cage07 {

	public static void main(String[] args) {
		int score =(int)(Math.random()*101);//random=0.0~0.99999
		//30~69分的話40)+30
		//101是因為有101個數
		System.out.println(score);
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
	}
}