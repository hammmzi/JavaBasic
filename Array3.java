public class Array3 {
	public static void main(String[] args) {
		
		int[] a = {0,10,20,30,40};
		int[] m;
		
		//aが見ている配列をｍも見ている、コピー✖
		//配列を同士に代入変数が同じ配列の実体を参照することになる…参照渡し：　2つの配列
		m=a;
		System.out.println("a[2] = " + a[2]);
		System.out.println("m[2] = " + m[2]);
		
		//一緒に変更
		m[2] = 100;
		System.out.println("a[2] = " + a[2]);
		System.out.println("m[2] = " + m[2]);

	}
}
