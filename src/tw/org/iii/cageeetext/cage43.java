package tw.org.iii.cageeetext;

import java.awt.FontFormatException;
import java.io.IOException;
import java.text.ParseException;

public class cage43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
		b1.setlag(2);
		}catch(IOException e){
			
		}catch(ParseException e) {
			
		}
	}
}
class Bird{
	private int leg;
	void setlag (int leg) throws ParseException,IOException { //規定程式要try catch
		if(leg<0) {
			throw new ParseException("XXX",3); // 彈性
		}else if(leg>2) {
			throw new IOException(); //宣告例外加s 拋出例外不用
		}else {
			this.leg = leg;
		}
	}
}
class Bird2 extends Bird{
	//@Override 要拋的比父類別少 比父類別小
//	void setlag(int leg) throws ParseException {
//		try {super.setlag(leg);}
//		catch(IOException e){}
//	}
//	void setlag(int leg){}
	
	void setlagv2(int leg) throws ParseException,IOException,FontFormatException {
		super.setlag(leg);
		if(leg>1000) {
			throw new FontFormatException("");
		}
	}
}