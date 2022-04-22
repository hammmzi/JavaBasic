import java.util.Scanner;

public class DoWhileSample {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {//先に処理
			System.out.print("パスワードを入力してください：");
			num = scan.nextInt();
		} while ( num != 5);//繰り返し
		
		System.out.println("確定されました。");
		
		scan.close();
	}

}
