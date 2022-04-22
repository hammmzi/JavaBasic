import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		
		//変数　　　　　　　　　Scannerという部品を使います
		Scanner scan = new Scanner(System.in);
		System.out.print("一つの整数を入力してください：　");
		int num1 = scan.nextInt();
		
		System.out.print("二つの整数を入力してください：　");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("入力された値の合計は" + sum + "です。");
		
		//---------------------
		System.out.print("小数を入力してください：　");
		double dbl = scan.nextDouble();
		int data = (int)dbl;
		System.out.println("整数部分は"+data+"です。");
		
		//もう使わないですよ！
		scan.close();
	}

}
