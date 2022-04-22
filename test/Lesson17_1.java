package test;

import java.util.ArrayList;
import java.util.List;

public class Lesson17_1 {

	public static void main(String[] args) {
		
		List<String> fruit = new ArrayList<String>();
		fruit.add("りんご");
		fruit.add("みかん");
		fruit.add("メロン");
		fruit.add("いちご");
		
		for (int i = 0; i < fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
		System.out.println("-----remove------");
		fruit.remove(1);
		fruit.remove(1);
		for (String reFruit : fruit) {
			System.out.println(reFruit);
		}
	}

}
