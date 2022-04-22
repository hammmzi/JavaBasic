package test;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {

	public static void main(String[] args) {
		// HashMap
		Map<String, String> map = new HashMap<String, String>();
		//キーは重複できない（インデックスは1つだけ）、同じキーを書くと上書きされる！！
		map.put("honda", "0120-11-3333");
		map.put("kagawa", "0423-22-6666");
		map.put("nagatomo", "03-678-5676");
		
		System.out.println("hondaの電話番号：" + map.get("honda"));
		System.out.println("kagawa電話番号：" + map.get("kagawa"));
		System.out.println("nagatomoの電話番号：" + map.get("nagatomo"));
	}

}
