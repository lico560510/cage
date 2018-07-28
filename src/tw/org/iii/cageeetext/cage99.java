package tw.org.iii.cageeetext;

public class cage99 {

	public static void main(String[] args) {
		for(int c=0;c<4;c++) {
			for(int y=1;y<=9;y++) {
				for(int i=2;i<=5;i++) {
					int newx =i +c*4;
					int r=newx*y;
					System.out.print(newx+"x"+y+"="+r+"\t");
				}
				System.out.println();
			}
			System.out.println("-------");
		}	
	}
}
