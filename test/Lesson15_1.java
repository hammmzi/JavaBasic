package test;

import java.util.Scanner;

public class Lesson15_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("文字列を入力してください：");
		String mozi = scan.next();
			
		System.out.println("入力された文字数は："+mozi.length()+"です。");
		
//		mozi.indexOf("today");
		
		if (mozi.lastIndexOf("today") != -1) {
			System.out.println("todayが含まれています。");
		}else {
			System.out.println("todayが含まれていません。");
		}
		 
		
		scan.close();
	}

}
