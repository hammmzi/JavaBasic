
public class UseCalc {

	public static void main(String[] args) {
		
		//staticメソッド　　class名．メソッド（引数）
		int a = Calc.add(3, 4);
		int b = Calc.sub(10, -4);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
