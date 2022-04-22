import java.util.Scanner;

public class Lesson9_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("年を入力してください：");
		int year = scan.nextInt();
		
//		System.out.println(year%400);
//		leapYear(year);
		
		if (isLeap(year)) {
			System.out.println(year+ "はうるう年です。");
		}else {
			System.out.println(year+ "はうるう年ではありません。");
		}
		
		
		scan.close();
		
	}
	
//	static void leapYear(int year) {
//		
//		if ((year%400 == 0) || (year%100 != 0 && year%4 == 0)) {
//			System.out.println(year+ "はうるう年です。");
//		}else {
//			System.out.println(year+ "はうるう年ではありません。");
//		}
//		
//	}
	static boolean isLeap(int year) {
		boolean result = ((year%400 == 0) || (year%100 != 0 && year%4 == 0));
		return result;
	}
	
}