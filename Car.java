
public class Car {

	//classのブロック内で直接変数を指定すると属性になる；
	String maker;
	int displacement;
	String color;
	
	void start() {
		System.out.println("発進します。");
	}
	void stop() {
		System.out.println("止まります。");
	}
	void curve() {
		System.out.println("曲がりなす。");
	}
}
