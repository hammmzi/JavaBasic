import java.util.Random;

public class SwichSample2 {

	public static void main(String[] args) {
		
		//Randomオブジェクト生成（部品）
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		
		switch (dice) {
		case 1:
			System.out.println("大吉です。");
			break;
		case 2:
			System.out.println("小吉です。");
			break;
		case 3:
			System.out.println("凶です。");
			break;
			
		default:
			System.out.println("吉です。");
			break;
		}

	}

}
