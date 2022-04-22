
public class UsePhone7 {


	public static void main(String[] args) {
		
		Phone3 p = new Phone3("010-2222-7777");
		HandyPhone4 h = new HandyPhone4("080-444-3333", "aaa:bbb.com");
		
		communicate(p);
		communicate(h);
		
	}
	public static void communicate(Phone3 p) {
		p.tel("8210-6272-8941");
		//もしHandyPhoneならメールもする
		if (p instanceof HandyPhone4) {
			HandyPhone4 h = (HandyPhone4)p;
			h.mail("sdfa@fgd.fg");
		}
	}
}
