
public class UsePhone4 {

	public static void main(String[] args) {
		
		HandyPhone4 h = new HandyPhone4("010-2222-7777", "hyunji@abc.dfc");
//		h.setNo("090-8888-6666");
//		h.setMailAddress("abc@aaa.com");
		System.out.println("Phone3とHandyPhone4を使う");
		h.tel("8210-6272-8941");
		h.mail("dcf@bbb.com");
		h.info();

	}

}
