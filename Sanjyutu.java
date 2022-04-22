
public class Sanjyutu {

	public static void main(String[] args) {
		// 
		int x = 5;
		int y = 2;
		
		int a = x+y; 
		int b = x-y;
		int c = x*y;
		int d = x/y;//소수점밑으로는 인트형이기때문에 없어짐
		int e = x%y;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);//5は奇数
		
		//괄호가 있을때는 괄호 안에 있는 거 먼저 계산!
		int ans1 = x+ y * 5;
		int ans2 = (x+y)*5;
		
		System.out.println("ans1 = " + ans1);
		System.out.println("ans2 = " + ans2);
		
	}

}
