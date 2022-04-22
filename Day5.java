
public class Day5 {

	private int year;
	private int month;
	private int date;
	
	
	String formatDay() {
		return year + "年" + month + "月" + date + "日";
	}

	Day5(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;

	}

	Day5(int year, int month) {
		this(year, month, 1);
	}
	
//public Employee(String name, String address, int year, int month, int date) {
//		
//	}

	//右クリック　→　ソース　→　getter　および　setterの生成
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

}
