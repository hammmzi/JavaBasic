import java.util.Scanner;

public class Ifelse5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("テストの点数を入力してください：");
		int score = scan.nextInt();
		
		//ifが必ず先、else　if  -> else
		//条件の優先順位に注意：if条件が先に処理
		
		//ネスト（入れ子構造）
		if (score <= 100  && score >= 0) {
			if (score >= 80) {
				System.out.println("よくできました。");
			} else if(score >= 60 ) {
				System.out.println("頑張りましょう！");
			}else {
				System.out.println("不合格です。");
			}
		} else {
			System.out.println("不正な数値です。");
		}
		
		
		System.out.println("2回目テストの点数を入力してください：");
		int test = scan.nextInt();
		
		if (test >= 80) {
			System.out.println("よくできました！");
		} 
		if(test == 100 || test == 90) {
			System.out.println("キリがいいですね！！");
		}
		if(test == 0){
			System.out.println("これはひどい！");
		}
		scan.close();
	}
}
