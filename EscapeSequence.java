public class EscapeSequence {
	public static void main(String[] args) {
		//역(백)슬레쉬 = 엔마크
		System.out.println("今日は\"晴れ\"です。");
		System.out.println("私の名前は\t吉田です。");
		System.out.println("Java\nC\nC++");
		System.out.println("Java");
		System.out.println("C");
		System.out.println("値段は\\500です。");
		char c = '\'';
		System.out.println("cの値は" + c + "です。");
		
		//유니코드
		char data = '\u3042';
		System.out.println(data);
	}
}
