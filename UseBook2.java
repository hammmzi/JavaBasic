
public class UseBook2 {

	public static void main(String[] args) {
		
		Book2 b1 = new Book2("TCP/IP入門", "吉田茂樹", 2200);
		Book2 b2 = new Book2("XMLのすべて", "高橋麻奈", 1800);
		Book2 b3 = new Book2();
		
		System.out.println(b1.getTitle());
		b3.setTitle("IT");
		
		b1.showBook();
		b2.showBook();
		b3.showBook();
		}

}
