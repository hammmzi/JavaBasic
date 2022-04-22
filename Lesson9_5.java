import java.util.Scanner;

public class Lesson9_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("数値を入力してください：");
			numbers[i] = scan.nextInt();
		}
		
		sumNumbers(numbers);
		
		scan.close();
		
	}
	
	static int sumNumbers(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("合計は" + sum);
		
		return sum;
	}
		
	}
	
