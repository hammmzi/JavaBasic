import java.util.Scanner;

public class Lesson9_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//点数入力
		System.out.print("点数を入力してください：");
		int score = scan.nextInt();

		//結果出力
		System.out.println(score + "は" + pass(score) + "です。");
		
		scan.close();
	}

	//合格・不合格判定
	//何の名前のメソッドを何をもらって何で返しますか？
	static String pass(int score) {
		String pass = "不合格";
		if ( score >= 70) {
			pass = "合格";
		}
		return pass;

	}
}
