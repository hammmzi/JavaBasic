public class UseSquareEx {
	public static void main(String[] args) {
		SquareEx s1 = new SquareEx();
		SquareEx s2 = new SquareEx();
//		s1.height = 15;
//		s1.width = 7;
		
//		s2.height = 6;
//		s2.width = 6;
		
		s1.setData(15, 7);
		s2.setData(6);
		
		System.out.println("辺の数：" + SquareEx.edge);
		System.out.println("s1	高さ：" + s1.height + " 幅：" + s1.width + " 面積：" + s1.area());
		System.out.println("s2	高さ：" + s2.height + " 幅：" + s2.width + " 面積：" + s2.area());
	}
}
