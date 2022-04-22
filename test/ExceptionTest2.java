package test;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			System.out.println("try文中");
			int[] a = new int[2];
			a[0] = 5;a[2] = 4;
			int i = 10, j = 0;
			int k = i / j;
			System.out.println("K = " + k);
		} catch (ArithmeticException e) {
			// 例外が発生した次の行からは実行されない！
			System.out.println("エラー：０で演算しました");
			//中でとString
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 文中");
			System.out.println("配列のインデックスをオーバーしました。");
			e.printStackTrace();

		} finally {
			System.out.println("finall　文中");
		}
		System.out.println("プログラム終了");

	}
}
