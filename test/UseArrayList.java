package test;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
		List<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Java");
		list.add("おはよう");
		list.add("こんにちは");
		for (int i = 0; i < list.size(); i++) { //list.length
			System.out.println(list.get(i));    //list[i]
		}
		System.out.println("-----remove------");
		list.remove(2);                     //削除
		list.set(2, "上書き");   			//上書き
		list.add(2, "追加");               //特定位置に挿入
		for (String str : list) {         
			System.out.println(str); 
		}
	}
	

}
