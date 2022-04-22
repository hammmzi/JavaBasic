
public class Phone2 {
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
}
