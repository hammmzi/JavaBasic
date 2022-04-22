public class Increment {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		//インクリメント（足し算）
		x = 10;
		//足してから代入（前置：ぜんち）
		y = ++x; // 前に付けた場合
		System.out.println("**前に付けた場合**");
		System.out.print("x = " + x);
		System.out.println(", y = " + y);

		//バグの原因になりやすいです
		x = 10;
		//xを代入した後、足す（後置：こうち）
		y = x++; // 後に付けた場合,　代入の後に足す、別に使わない！
		System.out.println("**後に付けた場合**");
		System.out.print("x = " + x);
		System.out.println(", y = " + y);
		
		//デクリメント（引き算）
		x = 10;
		y = --x;
		System.out.println("デクリメント（前に付けた場合）");
		System.out.print("x = " + x);
		System.out.println(", y = " + y);
		
		x = 10;
		y = x--;
		System.out.println("デクリメント（後に付けた場合）");
		System.out.print("x = " + x);
		System.out.println(", y = " + y);
	}
}
