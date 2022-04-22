
public class Cast {

	public static void main(String[] args) {
		
		long l = 10;
		//long型のｌの値をint型に変換（int型のaにキャスト）
		int a = (int) l;
		System.out.println("a = " + a);
		
		//bitでの切り捨てが発生
		int x= 234;
		byte y = (byte) x;
		System.out.println("y = "+ y);
		
		//少数を整数にするにはこっちの方が適切
		double d = 3.8;
		int m =(int) d;
		System.out.println("m = "+ m);

	}

}
