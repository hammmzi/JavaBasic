public class Day9 {
	int year;
	int month;
	int date;

	public Day9(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public String toString() {
		return year + "年" + month + "月" + date + "日";
	}

	//追記                          オブジェクト型　何でもいいからオブジェクトを比較します
	public boolean equals(Object o) {
		//キャスト
		Day9 d  =(Day9) o;
		if(year == d.year && month == d.month && date == d.date) {
			return true;
		}else {
			return false;
		}
	}


	
}