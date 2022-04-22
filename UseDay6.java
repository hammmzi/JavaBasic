
public class UseDay6 {

	public static void main(String[] args) {
		
		//配列の宣言、領域の確保、各要素の初期化を一度に行う
		
		Day5[] ary = new Day5[] { 
				new Day5(1993, 7, 10),
				new Day5(2020, 12, 31),
				new Day5(2022, 4, 15)
		};
		
//		Day5[] ary = { new Day5(1997, 3, 10), new Day5(2020, 12, 31), new Day5(2022, 4, 15)};
		
//		Day5[] ary;
//		ary = new Day5[3];
//		
//		ary[0] = new Day5(1997, 7, 10);
//		ary[1] = new Day5(2010, 12, 31);
//		ary[2] = new Day5(2022, 4, 15);
		
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i].formatDay());
		}
		
		System.out.println();
		
		//拡張for文で出力
		for(Day5 day : ary) {
			System.out.println(day.formatDay());
		}
		
		
	}

}
