
public class Phone3 {
	private String no;
	
	
	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	void tel(String to) {
		System.out.println(no + "から" + to + "へ電話しました。");
	}
	
	public Phone3(String no) {
		this.no = no;
	}
}
