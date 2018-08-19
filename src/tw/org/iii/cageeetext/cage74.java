package tw.org.iii.cageeetext;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class cage74 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "sam");
		map.put("stage", 2);
		map.put("sound", false);
		map.put("other", 2);  //原生cllection 可以有重複的元素
		System.out.println(map);
		System.out.println(map.get("map"));
		System.out.println(map.get("stage"));
		System.out.println(map.get("sound"));
		Set<String>keys = map.keySet();
		for(String key:keys) {
			System.out.println(map.get(key));
		}
		Collection<Object> v =map.values();
		for(Object obj:v) {
			System.out.println(obj);
		}
	}
}
