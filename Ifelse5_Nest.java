import java.util.Scanner;

public class Ifelse5_Nest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("テストの点数を入力してください:");
		int score = scan.nextInt();
		
		//ネスト
		if(score <= 100 && score >= 0) {
			System.out.println("テストの点数を元にメッセージを出します。");
			if (score >= 80) {
				System.out.println("よくできました");
			} else if (score >= 60) {
				System.out.println("がんばりましょう");
			} else {
				System.out.println("不合格です");
			}
		}else {
			System.out.println("不正な数値です");
		}

		scan.close();
	}
}
