import java.util.Scanner;

public class Lesson8_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("あなたの点数を入力してください：");
			scores[i] = scan.nextInt();
		}

//---------------------------------------------------------------
		
		
		//最大値を記録？
		int max = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			if(max<scores[i]) {
				max = scores[i];
			}
		}
		System.out.println(max);
		scan.close();
	}

}
