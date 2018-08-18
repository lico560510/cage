package tw.org.iii.cageeetext;

import java.util.LinkedList;

public class class72 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("sam");
		names.add("sam");
		names.add("bob");
		names.add("cage");
		System.out.println(names.size());
		System.out.println(names);
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println(names.get(3));
	}
}
