package test;

import java.util.Scanner;

public class Lesson16_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1つ目の少数を入力してください：");
		String strNum1 = scan.nextLine();
		System.out.print("2つ目の少数を入力してください：");
		String strNum2 = scan.nextLine();
		
		try {
			double dNum1 = Double.parseDouble(strNum1);
			double dNum2 = Double.parseDouble(strNum2);
			
//			double dNum1,dNum2 = Double.parseDouble(strNum1,strNum2);
			
			double sum = dNum1 + dNum2;
			System.out.println("合計は" +sum +"です。");
		} catch (Exception e) {
			System.out.println("入力された値が少数ではありません。");
		}finally {
			scan.close();
		}

	}

}
