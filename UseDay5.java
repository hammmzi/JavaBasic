
public class UseDay5 {

	public static void main(String[] args) {
		//初期化（フィールド）: コンストラクタ
		Day5  d1= new Day5(2007, 12,30);
		Day5 d2 = new Day5(2022, 4);
		
//		d1.setYear(-500);
//		d1.year(-500);
		
		System.out.println("インスタンスd1の年は" + d1.getYear()+"年");
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
		
	}

}
