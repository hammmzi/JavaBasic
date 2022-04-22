
public class UseCar {

	public static void main(String[] args) {
		
		//参照変数の宣言とオブジェクト生成
		Car c1 = new Car();
		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";
		
		c1.start();
		c1.curve();
		c1.stop();
		
		
		System.out.println("c1のメーカーは" + c1.maker  + "です。");
		System.out.println("c1の色は" + c1.color  + "です。");

	}

}
