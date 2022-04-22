import java.util.Scanner;

public class Lesson7_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		// System.out.println("降水確率は０から100に間の数値で入力をお願いします！");
		System.out.print("降水確率は０から100に間の数値で入力をお願いします！\n 降水確率を入力してください：");
		double rain = scan.nextDouble();

//		if (rain<= 100 && rain >= 70) {
//			System.out.println("傘を必ず持っていきましょう。");
//		} else if (rain >= 20 && rain < 70) {
//			System.out.println("傘はあった方がいいかも…");
//		} else if (0 <= rain && rain < 20) {
//			System.out.println("傘はいらないでしょう。");
//		} 
//		else {
//			System.out.println("０から100の間の数値ではありません。");
//		}

		// 0～100の範囲外でエラー（ネスト）
		if (0 <= rain && rain <= 100) {
			if (rain >= 70) {
				System.out.println("傘を必ず持っていきましょう。");
			} else if (rain >= 20 && rain < 70) {
				System.out.println("傘はあった方がいいかも…");
			} else if (0 <= rain && rain < 20) {
				System.out.println("傘はいらないでしょう。");
			} 
		}else {
			System.out.println("０から100の間の数値ではありません。");
		}
		scan.close();
	}

}
