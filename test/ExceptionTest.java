package test;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			
			int i = 10, j = 0;
			int k = i / j;
			System.out.println("K = " + k);
			
		} catch (ArithmeticException e) {
			//例外が発生した次の行からは実行されない！
			System.out.println("エラー：０で割りました");
			e.printStackTrace();
		}
	System.out.println("main終了");
	}
}
