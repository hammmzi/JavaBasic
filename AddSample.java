
public class AddSample {

	public static void main(String[] args) {
		
		int a = add(3, 4);
		int b = add(10, -4);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println(add(500, 800));
	}
	
	//新しいメソッド
	static int add(int a, int b) {//引数
		int result = a + b;//メソッド内の処理
		return result;//戻り値
	}

}
