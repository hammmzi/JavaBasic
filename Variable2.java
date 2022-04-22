

public class Variable2 {

	public static void main(String[] args) {
		// 変数の宣言と表示
		int a; //初期化されてない
		int b = 30; //宣言と初期化が同時に行っている
		b = 40;//30の値に40に上書き
		a = b;//aにｂの値を初期化
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);

	}

}
