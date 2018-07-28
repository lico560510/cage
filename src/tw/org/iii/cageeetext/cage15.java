package tw.org.iii.cageeetext;

public class cage15 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;//直接跳去迴圈
			}
			System.out.println(i);
		}
		System.out.println("-----------");
		
		cage: //標籤 只能緊跟著迴圈敘述句 for while do...while
		for(int i=0; i<10; i++) {
			for(int j=0; j<10 ;j++) {
				if(i + j >=10) {
					break cage;
				}
				System.out.println(i+":"+j);
			}
		}
	}
}
