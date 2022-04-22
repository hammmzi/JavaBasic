import java.util.Scanner;

public class Keyboard2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("苗字を入力してください：　");
		String lastName = scan.nextLine();
		
		//scan.next() : 連続で入力する時、少しだけ早い
		System.out.print("名前を入力してください：　");
		String fristName = scan.next();
		
		System.out.println("あなたのフルネームは" + lastName + fristName + "ですね。");
		
		scan.close();
	}

}
