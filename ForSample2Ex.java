public class ForSample2Ex {
	public static void main(String[] args) {
		int[] ary = { 10, 15, 12, 8};	//ary.length
		
		for (int i = (ary.length - 1); i >= 0 ; i--) {
			System.out.println("ary[" + i + "] = " + ary[i]);
		}
		
		for (int i = 0; i < ary.length; i++) {
			System.out.println("ary[" + i + "] = " + ary[i]);
		}
	}
}
