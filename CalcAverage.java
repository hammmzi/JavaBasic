import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] ary = new int[5];
		
		for (int j = 0; j < ary.length; j++) {
			System.out.print("点数を入力してください：");
			ary[j] = scan.nextInt();
		}
		
		
		double avg = average(ary);
		System.out.println("平均点は" + avg + "です。");
		
		scan.close();

	}
	static double average(int[] scores) {
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double average = (double)sum/scores.length;
		return average;
	}

}
