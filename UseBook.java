
public class UseBook {

	public static void main(String[] args) {
		
		Book b1 = new Book("TCP/IP入門", "吉田茂樹", 2200);
		Book b2 = new Book("XMLのすべて", "高橋麻奈", 1800);
		Book b3 = new Book();
		
		b1.showBook();
		b2.showBook();
		b3.showBook();
		}

}
