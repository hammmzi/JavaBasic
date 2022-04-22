public class Counter {
	//インスタンスフィールド宣言
	int counter = 1;

	//1増える +
	void countUp() {
		counter++;
	}

	void countUp(int num) {
		counter += num;
	}

	int getCount() {
		return counter;
	}
}