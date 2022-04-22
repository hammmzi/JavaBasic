package test;

import java.util.Scanner;

public class NumberFormatCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("整数を入力してください：");
		String numStr = scan.nextLine();

		try {
			int num = Integer.parseInt(numStr);
			
			//少数変換
			double dNum = Double.parseDouble(numStr);
			
			System.out.println("入力された整数は" + num);
		
		} catch (NumberFormatException e) {
			System.out.println("整数を入力してください！");
		
		} finally {
			scan.close();
		}

	}

}
