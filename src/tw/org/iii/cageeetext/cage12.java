package tw.org.iii.cageeetext;

public class cage12 {

	public static void main(String[] args) {
		char a=97;
		switch (a) {  //byte short char int
		case 1: System.out.println("1");break;
		case 10: System.out.println("10");break;
		case 'a': System.out.println("a");break;
		case 'A': System.out.println("A");break;
		default: System.out.println("D");break;
		}
		String b="cage";
		switch (b) {  //byte short char int
		case "b": System.out.println("1");break;
		case "cage": System.out.println("10");break;
		case "c": System.out.println("a");break;
		case "d": System.out.println("A");break;
		default: System.out.println("D");break;
		}
	}

}
