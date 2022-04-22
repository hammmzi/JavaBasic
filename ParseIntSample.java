import java.util.Scanner;

public class ParseIntSample {

	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "456";
		
		//文字列　＋　文字列
		System.out.println(str1 + str2);

	 //数字を整数に変換される
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		
		//Scannerで入力した後に変換
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1つ目の数字を入力してください：");
		String str3 = scan.nextLine();
		System.out.print("2つ目の数字を入力してください：");
		String str4 = scan.nextLine();
		
		int num3 = Integer.parseInt(str3);
		int num4 = Integer.parseInt(str4);
		System.out.println(num3 + num4 );
		
		scan.close();
		}

}
