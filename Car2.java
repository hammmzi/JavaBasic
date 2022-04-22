
public class Car2 {

	String maker;
	int displacement;
	String color;
	
	Car2(){
		maker = "TOYOTA";
		displacement  = 1000;
		color = "白";
	}
	
	Car2(String m,int d, String c){
		maker = m;
		displacement = d;
		color = c;
	}
	
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
