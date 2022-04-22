public class ForSample5 {
	public static void main(String[] args) {
		
		int[] ary = { 10, 15, 12, 8};
		
		//拡張for文を使用 : 全ての要素をfor文が取り出してくれる
		for( int data : ary) {
			System.out.println(data);
		}
		
		int[][] m = { 
								{ 1, 2, 3 }, 						//0 m[0].length
								{ 10, 20 }, 						//1 m[1].length
								{ 100, 200, 300, 400 } 	//2 m[2].length 
			};
		for (int[] data : m) {

			System.out.println(data);
		}
	}
}
