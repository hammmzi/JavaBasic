
public class ForSample2 { 

	public static void main(String[] args) {
		
		int[] ary = { 10, 15, 12, 8, 45, 532};
		//　　　　　　　　　　要素数の変更にも使える！→配列の個数を変動した時、対応できる！
		for (int i = 0; i < ary.length; i++) {
			System.out.println("ary[ " + i + " ] = " + ary[i]);
		}
		//逆文
		for (int i = ary.length - 1;  i >=0;  i--) {
			System.out.println("ary[ " + i + " ] = " + ary[i]);
		}
	}

}
