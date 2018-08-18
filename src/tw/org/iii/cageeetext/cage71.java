package tw.org.iii.cageeetext;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class cage71 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		//set.add(123);set.add("Brad"); //為了確認拿到的型別是你要的
		while(set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.print(num+",");
		}
		System.out.println("");
		System.out.println("----------------------");
		for(Integer num : set) {
			System.out.print(num+", ");
		}
//		set.add(23);
//		set.add(332);
//		set.add("cage");
//		set.add(new Bike());
//		set.add(12);
//		System.out.println(set.size());
//	//不會重覆
//		set.add(23);
//		System.out.println(set.size());
	}
}
