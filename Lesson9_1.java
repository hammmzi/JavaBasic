
public class Lesson9_1 {

	public static void main(String[] args) {
		
		double a = division(3.14, 56.3);
		double b = division(0.12, 87.4);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//割り算
	static double division(double num1, double num2) {
		double div = num1 /  num2;
		return div;
	}

}
