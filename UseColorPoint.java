
public class UseColorPoint {

	public static void main(String[] args) {
		
		//Point, ColorPointオブジェクトをそれぞれ2つずつ代入
		
		//配列で生成
		Point[] p = {
							new Point(3, 9),
							new ColorPoint(12, -3, "RED"),
							new Point(56, 2),
							new ColorPoint(7, -28, "BLUE")};
		
		//拡張for文で出力
		for(Point color : p) {
			color.color();
			System.out.println();
		}

	}

}
