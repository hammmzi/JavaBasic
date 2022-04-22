package jbasic_mission;

import java.util.Scanner;

public class If16{
	public static void main(String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数を入力してください：");
		int num = scan.nextInt();
		
		if (num >= 10) {
			System.out.println("入力された値は10以上です。");
		} 
		scan.close();
	}
}