import java.util.Scanner;

public class Lesson9_4Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("年を入力してください：");
		int year = scan.nextInt();

		if(isLeap(year)) {	//if(isLeap(year) == true) でもOK
			System.out.println(year + "年はうるう年です");
		} else {
			System.out.println(year + "年はうるう年ではありません");
		}

		scan.close();
	}

	static boolean isLeap(int year) {
		
		boolean result = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		return result;
		
//まとめて書いてもOK
//		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}
