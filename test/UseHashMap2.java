package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseHashMap2 {

	public static void main(String[] args) {
		// HashMap
		Map<String, String> map = new HashMap<String, String>();
		map.put("honda", "0120-11-3333");
		map.put("kagawa", "0423-22-6666");
		map.put("nagatomo", "03-678-5676");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key +"の電話番号：" + map.get(key));
		}
		
	}

}
