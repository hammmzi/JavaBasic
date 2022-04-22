import java.util.Scanner;

public class Lesson7_1 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("月を入力してください：");
		int month = scan.nextInt();
		
		if (month > 0 && month <=12) {
			System.out.println(month + "は正しい月です。");
		} else {
			System.out.println("正しくない月です。");
		}

		scan.close();
	}

}
