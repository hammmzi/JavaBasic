
public class UsePhone5 {

	public static void main(String[] args) {
	
		//pはPhone3型なのでtelは使えますが、HandyPhone４のmailは使えない!!	
		Phone3 h = new HandyPhone4("010-2222-7777", "hyunji@abc.dfc");
		System.out.println("Phone3とHandyPhone4を使う");
		h.tel("8210-6272-8941");
//		h.mail("dcf@bbb.com");
//		h.info();

	}

}
