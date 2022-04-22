
public class ColorPoint extends Point {

	private String color;
	
	//カプセル化
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//コンストラクタ
	public ColorPoint(int x, int y, String color) {
		//スーパークラス（親クラス）の引数を呼び出す
		super(x,y);
		this.color = color;
	}
	
	//画面に座標と色出力
	public void color() {
//		System.out.println("x : " + getX() + " y : " + getY());
		super.color();
		System.out.println("color : " + color);
	}
}
