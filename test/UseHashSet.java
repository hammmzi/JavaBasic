package test;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Java");
		set.add("78");
		set.add("Java");
		set.add("123");
		           //特定位置に挿入
		for (String elem : set) {         
			System.out.println(elem); 
		}
	}
	

}
