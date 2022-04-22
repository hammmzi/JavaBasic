
public class HandyPhone3 extends Phone2{

	private String mailAddress;
	
	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へメールしました。");
	}
	
	void info() {
		System.out.println("電話番号 = " + getNo() + ", メールアドレス＝" + mailAddress);
	}
}
