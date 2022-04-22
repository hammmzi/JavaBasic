
public class UseSample {
	public static void main(String[] args) {
		
		//インスタンス化→参照変数s1,s2生成
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.a = 10;
		s1.b = 20;
		s2.a = -30;
		s2.b = 100;

		System.out.println("インスタンス　s1のaは" + s1.a);
		System.out.println("インスタンス　s1のbは" + s1.b);
		System.out.println("インスタンス　s1のaとbの合計は" + s1.sum());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("インスタンス　s2のaは" + s2.a);
		System.out.println("インスタンス　s2のbは" + s2.b);
		System.out.println("インスタンス　s2のaとbの合計は" + s2.sum());
	}

}
