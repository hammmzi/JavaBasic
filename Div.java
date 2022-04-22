public class Div {//class名とファイル名は同じ！
	public static void main(String[] args) {
		System.out.println("5/2の結果は" + (5 / 2) + "です");
		System.out.println("5/2.0の結果は" + (5 / 2.0) + "です");

		//表現能力の大きい方の型に合わせて演算される
		//double(64bit) > float(32bit)
		double d = 5.0;
		float f = 2.0f;
		double answer = d / f;
		System.out.println(answer);

		//int > byte
		byte x = 5;
		byte y = 2;
		int answer2 = x / y;
		System.out.println(answer2);

		
		//キャストを使った計算
		//型が異なる場合もバイト（byte）の大きい方に合わせられる
		int i = 5;
		int j = 2;
		//int型にすると２だけ出力
		double answer3 = (double) i / j;
		//→　5.0/2になる
		System.out.println(answer3);
	}
}
