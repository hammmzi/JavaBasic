
public class UseString {

	public static void main(String[] args) {
		
		String s1 = "This is a sample";
		//文字列の長さ ↼メソッドが隠されている
		System.out.println("" + s1.length());
		//文字列の取り出し
		System.out.println("" + s1.charAt(3));
		//文字列の切り出し
		System.out.println("" + s1.substring(3, 9));
		  
		//文字列の検索
		String s2 = "abcabcabcabcabcabc";
		System.out.println("index : " + s2.indexOf("def"));
		System.out.println("last:"+ " " + s2.lastIndexOf("abc") );
		
		//文字列の変換
		String s3 = "AvCdEfG";
		System.out.println("UpperCase : " + s3.toUpperCase());
		System.out.println("LowerCase : " + s3.toLowerCase());

		//文字列の比較
		String s4 = new String("this is a pen");
		String s5 = new String("this is a pen");
		if (s4.equals(s5)) {
			System.out.println("s4とs5は同じ文字列です。");
		}else {
			System.out.println("s4とs5は違う文字列です。");
		}
		
		String address = "東京部豊島区池袋1-2-3";
		int index = address.indexOf("区");
		String address2 = address.substring(index + 1);
		
		System.out.println(address2);
		
	}

}
