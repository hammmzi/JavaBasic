package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseArrayList2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3); //list.add(Integer.valueOf(3)); 
		list.add(10);
		list.add(5);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("-----s挿入------");
		list.add(1, Integer.valueOf(-7));
		for(Integer i : list) {
			System.out.println(i);
		}
	}
	

}
