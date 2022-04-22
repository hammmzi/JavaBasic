import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//変数　num（入力数）、sum（入力数を足した数）を０に初期化
		int num,sum = 0;
		System.out.print("数値を入力してください：");
		//　　　　　入力された数値が０になるまで
		while ((num = scan.nextInt()) != 0) {
			if(num % 5 == 0) {
				System.out.println("5の倍数ですね！");
			}
			//入力された数値を足す！
			sum += num;
			//繰り返して変動する数あったらコードで確認可能！
			System.out.println("今のsum : "+sum);
			//また入力
			System.out.print("数値を入力してください：");
		}
		System.out.println("入力された数値の合計は"+ sum + "です。");
		scan.close();
	}

}
