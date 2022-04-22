public class Lesson4_2 {
	public static void main(String[] args) {
		byte b = 0;
		int i = 10;
		b = (byte)i;

		System.out.println("b = " + b);
		System.out.println("i = " + i);

		float f = 1.0f;
		double d = 3.14159;
		f = (float)d;

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		double sosu = 23.33;
		int teisu = (int)sosu;
		System.out.println(teisu);
	}
}