public class Array6 {
	public static void main(String[] args) {
		int[][] m = { 
								{ 1, 2, 3 }, //0
								{ 10, 20 }, //1
								{ 100, 200, 300, 400 }//2
							};

		// いくつかの要素を出力
		System.out.println("m[0][0] = " + m[0][0]);
		System.out.println("m[0][2] = " + m[0][2]);
		System.out.println("m[1][0] = " + m[1][0]);
		System.out.println("m[2][3] = " + m[2][3]);
		
		m[0][2]=500;
		System.out.println("m[0][2] = " + m[0][2]);
		
		//要素数の表示（追記）…　あとから付け足して書くこと。また、その文。
		System.out.println("m.length = " + m.length);
		System.out.println("m[0].length = " + m[0].length);
		System.out.println("m[1].length = " + m[1].length);
		System.out.println("m[2].length = " + m[2].length);
	}
}
