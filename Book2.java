
public class Book2 {
	
	private String title;
	private String writer;
	private int price;
	
	//デフォルトコンストラクタ
	Book2(){
		title = "未定";
		writer = "未定";
		price = 0;
	}
	
	Book2(String title, String writer, int price){
		this.title = title;
		this.writer = writer;
		this.price =price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String t) {
		title = t;
	}

	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String w) {
		writer = w;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		//ローカル変数とフィールドの区分
		this.price = price;
	}
	
	
	//戻り値がない
	void showBook() {
		System.out.println("タイトル：" + title + " 著者：" + writer + "　値段： " + price + "円");
	}
}
