
public class UseDay4 {

	public static void main(String[] args) {
		//初期化（フィールド）: コンストラクタ
		Day4  d1= new Day4(2007, 12,30);
		Day4 d2 = new Day4(2022, 4);
		
//		d1.setYear(-500);
//		d1.year(-500);
		
		System.out.println("インスタンスd1の年は" + d1.getYear()+"年");
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
		
	}

}
