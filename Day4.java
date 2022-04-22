
public class Day4 {

	private int year;
	private int month;
	private int date;

	String formatDay() {
		return year + "年" + month + "月" + date + "日";
	}

	Day4(int y, int m, int d) {
		year = y;
		month = m;
		date = d;

	}

	Day4(int y, int m) {
		year = y;
		month = m;
		date = 1;
	}

	//setはしない：初期設定で受けた情報が変換できない
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}
}
