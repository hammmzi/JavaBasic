import java.util.Scanner;

public class Lesson5_2 {

	public static void main(String[] args) {
		// 課題2：消費税込みの値段
		Scanner scan = new Scanner(System.in);
		
		System.out.print("商品の値段を入力してください：");
		int price = scan.nextInt();
		
		double  tex= price*0.1;
		//int priceWithTex = (int)(price*1.1);
		System.out.println("消費税（10%）込みの値段：" + (int)(price+tex));
		
		scan.close();
	}

}
