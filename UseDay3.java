
public class UseDay3 {

	public static void main(String[] args) {
		//初期化（フィールド）
		Day3  d1= new Day3(2007, 12,30);
		Day3 d2 = new Day3(2022, 4);
		
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
		
	}

}
