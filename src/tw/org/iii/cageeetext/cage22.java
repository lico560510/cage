package tw.org.iii.cageeetext;

public class cage22 {

	public static void main(String[] args) {
//		if(TWId.checkId("A123456789")){
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
//		TWId id1= TWId.createTWId("A123456789");
//		System.out.println(id1==null);
		TWId id1=new TWId();
		TWId id2=new TWId(true);
		TWId id3=new TWId(14);
		TWId id4=new TWId(false,17);
		TWId id5= TWId.createTWId("A123456789");
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println(id5.getId());
		System.out.println(id5.isMale());
	}
}
