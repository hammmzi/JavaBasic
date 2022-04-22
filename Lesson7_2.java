import java.util.Scanner;

public class Lesson7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		
		System.out.print("1から3の中の数を入力してください：");
		int msg = scan.nextInt();
		
		switch (msg) {
		case 1:
			System.out.println("優です。");
			break;
		case 2:
			System.out.println("良です。");
			break;
		case 3:
			System.out.println("可です。");
			break;
		default:
			System.out.println("1から3の間にある数を入力してください");
			break;
		}
		scan.close();
	}

}
