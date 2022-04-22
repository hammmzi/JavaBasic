import java.util.Scanner;

public class ShowIntroduction {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力してください：　");
		String name = scan.nextLine();
		introduce(name);
		
		System.out.print("もう一人、名前を入力してください：　");
		name = scan.nextLine();
		introduce(name);
		
		scan.close();

	}
	
	//名前の受け取り、自己紹介を出力するメソッド
	static void introduce(String name){
		//なぜ戻り値がなくてもいいか？：演算することじゃなく、出力するだけ
		
		System.out.println("はじめまして。");
		System.out.println("私の名前は" + name + "です。");
		System.out.println("よろしくお願いします。");
	}

}
