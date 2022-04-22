
public class UseDay2 {

	public static void main(String[] args) {
		//初期化（フィールド）
		Day2  d1= new Day2(2007, 12,30);
		Day2 d2 = new Day2(1997, 7, 10);
		
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
		
		//上書き可能
		d1.year = 2022;
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		
	}

}
