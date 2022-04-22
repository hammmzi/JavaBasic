
public class UseCar2 {

	public static void main(String[] args) {
		
		//参照変数の宣言とオブジェクト生成
		Car c1 = new Car(); //1台目の車のインスタンス生成
		Car c2 = new Car(); //1台目の車のインスタンス生成
				
		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";
		
		c2.maker  = "TOYOTA";
		c1.displacement = 3000;
		c2.color = "赤い";
		
		System.out.println("c1のメーカーは" + c1.maker  + "です。");
		System.out.println("c1の色は" + c1.color  + "です。");
		
		System.out.println("c1のメーカーは" + c2.maker  + "です。");
		System.out.println("c1の色は" + c2.color  + "です。");

	}

}
