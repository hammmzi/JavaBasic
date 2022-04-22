
public class SwichSample {

	public static void main(String[] args) {
		//switchを利用した分岐処理 
		int dice = 4;
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
