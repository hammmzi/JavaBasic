package test;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {

	public static void main(String[] args) {

		//Linked붙이면변함
		Set<String> set = new TreeSet<String>();
		set.add("Hello");
		set.add("Java");
		set.add("78");
		set.add("Java");
		set.add("123");
		for (String elem : set) {         
			System.out.println(elem); 
		}
	}
}
