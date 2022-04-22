public class B extends A {
	int y;

	B() {
		super();//一番上！
		y = 20;
		System.out.println("クラスBのコンストラクタを実行しました。");
	}
}