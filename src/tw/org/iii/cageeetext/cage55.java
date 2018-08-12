package tw.org.iii.cageeetext;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class cage55 {
//物件序列化
	public static void main(String[] args) {
		Bike b1 = new Bike();
		Student s1 = new Student(90,80,70,b1);
		System.out.println("Avg"+s1.calAvg()+"Sum"+s1.calSum());
		try(ObjectOutputStream ooot =
				new ObjectOutputStream(
						new FileOutputStream("dir1/brad.object")) ) {
			ooot.writeObject(s1);
			System.out.println("Save OK");
		}catch(Exception e){
			
		}
	}
}
class Student implements Serializable{ //宣告可序列化
	int ch, eng;
	transient int math; //不去序列化
	Bike bike;
	Student(int ch,int eng,int math,Bike bike){
		this.ch=ch; this.eng = eng; this.math = math;
		this.bike = bike;
	}
	int calSum() {
		return ch+eng+math;
	}
	double calAvg() {
		return calSum()/3.0;
	}
}