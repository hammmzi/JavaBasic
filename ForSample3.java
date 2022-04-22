import java.util.Scanner;

public class ForSample3 { 

	public static void main(String[] args) {
		
		//入力オブジェクト
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[3];//配列の宣言と個数を指定
		
		//入力用ループ
		for (int i = 0; i < scores.length; i++) {//iが０からscores配列の数分繰り返し
			System.out.print((i +1) +"人目の点数を入力してください：");
			scores[i] = scan.nextInt();
		}
		
		//出力用のループ
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1)+ "人目の点数：" + scores[i] + "点");
			sum += scores[i];
			//scores[i]に入っている配列を足しながら繰り返す
		}
		
		//平均
		double average =(double) sum / scores.length;
		System.out.println("全体平均点は" + average + "点です。");
		
		scan.close();
	}

}
