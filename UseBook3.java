
public class UseBook3 {

	public static void main(String[] args) {
		
		//配列
//		Book2[] list = new Book2[] {
//				new Book2("TCP/IP入門", "吉田茂樹", 2200),
//				new Book2("XMLのすべて", "高橋麻奈", 1800),
//				new Book2("話せる英語文", "有小山", 1500)
//		};
		
		Book2[] list = {
				new Book2("TCP/IP入門", "吉田茂樹", 2200),
				new Book2("XMLのすべて", "高橋麻奈", 1800),
				new Book2("話せる英語文", "有小山", 1500)
		};
		
		//showBook → 이미println으로 결과값을 받아오기 때문에 사용불가
		for (int i = 0; i < list.length; i++) {
			list[i].showBook();
		}
		
		for(Book2 book : list) {
			book.showBook();
		}
		
		}

}
