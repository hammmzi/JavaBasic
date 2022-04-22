
public class UseDay {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Day d1 = new Day();
		Day d2 = new Day();
		
		d1.year = 2007;
		d1.month = 12;
		d1.date = 30;
		
		d2.year = 1997;
		d2.month = 7;
		d2.date = 10;
		
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("私の誕生日は" + d2.formatDay());
	}

}
