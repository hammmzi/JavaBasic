
public class Lesson9_2 {

	
	public static void main(String[] args) {
		
		today(2022, 4, 14);		
		today(2022, 5, 20);
		
	}

	static void today(int year, int month, int date) {
		System.out.println(year + "年" + month + "月" + date +"日");
	}

	//내가 짠 코드^^	
//	public static void main(String[] args) {
//		
//		String day1 = today(2022, 4, 14);		
//		String day2 = today(2022, 5, 20);		
//		
//		System.out.println(day1);
//		System.out.println(day2);
//		
//	}
	
//	static String today(int year, int month, int date) {
//		String today = year + "年" + month + "月" + date +"日";
//		return today;
//	}
}
