
public class Book {
	
	String title;
	String writer;
	int price;
	
	//デフォルトコンストラクタ
	Book(){
		title = "未定";
		writer = "未定";
		price = 0;
	}
	
	Book(String t, String w, int p){
		title = t;
		writer = w;
		price =p;
	}
	
	//戻り値がない
	void showBook() {
		System.out.println("タイトル：" + title + " 著者：" + writer + "　値段： " + price + "円");
	}
}
