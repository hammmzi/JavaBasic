import java.util.Scanner;

public class Lesson6_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] program = {"C","C++","Java","C#"};
		System.out.println("言語1："+ program[0]);
		System.out.println("言語2："+ program[1]);
		System.out.println("言語3："+ program[2]);
		System.out.println("言語4："+ program[3]);
		
		//입력으로 배열을 넣을 순 없나요? - 되는데 배열수는 정해놔야함
		Scanner scan = new Scanner(System.in);
		String[] pro = new String[4];
		
		System.out.print("言語1：");
		//String pro[0]はエラー→String型だと既に宣言できてるから
		pro[0] = scan.nextLine();
		System.out.print("言語2：");
		pro[1] = scan.nextLine();
		System.out.print("言語3：");
		pro[2] = scan.nextLine();
		System.out.print("言語4：");
		pro[3] = scan.nextLine();
		
		System.out.println("言語1："+ pro[0]);
		System.out.println("言語2："+ pro[1]);
		System.out.println("言語3："+ pro[2]);
		System.out.println("言語4："+ pro[3]);
		
		scan.close();
	}

}
