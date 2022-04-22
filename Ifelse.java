import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("整数を入力してください：");
		int num = scan.nextInt();
		
		if ((num % 2) == 0) {
			System.out.println("numは偶数です。");
			System.out.println("整数の命令文をブロックに入れます。");
		} else {
			System.out.println("numは奇数です。");

			//반복문은 어떻게 만들지..			
//			System.out.print("整数を入力してください：");
//			num = scan.nextInt();
		}

		scan.close();
	}

}
