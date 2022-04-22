public class BreakSample {
	public static void main(String[] args) {
		
		//flag回収
		int flag = 0;
		
		int[] a = { 10, -3, 5, 7, 9, 100, 30, -3 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 7) {
				System.out.println("ラッキー７が見つかりました。");
				flag = 1;
				break;
			}
			//確認
			System.out.println(a[i]);
		}
		//if(flag == 0){
		System.out.println("検索結果がありなません");
//	}
	}
}
