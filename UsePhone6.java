
public class UsePhone6 {


	public static void main(String[] args) {
		
		Phone3 p = new HandyPhone4("010-2222-7777", "hyunji@abc.dfc");
		System.out.println("HandyPhoneをPhoneとして使う");
		p.tel("8210-6272-8941");
		
		System.out.println("HandyPhoneをHandyPhoneとして使う");
		//キャスト：範囲を広げて戻す
		HandyPhone4 h= (HandyPhone4)p;
		h.mail("myfriend@asddf.com");
	}
}
