import java.util.Scanner;

public class Lesson5_1 {

	public static void main(String[] args) {
		// 課題1：三角形の面積
		Scanner scan = new Scanner(System.in);
		
		System.out.print("三角形の底辺を入力してください：");
		double  triangleSide = scan.nextInt();
		System.out.print("三角形の高さを入力してください：");
		double triangleHeight = scan.nextInt();

		double triangleArea = 0.5 * triangleSide * triangleHeight;
		// triangSide*triangleHeight/2.0;
		System.out.println("三角形の面積："+triangleArea);
		
		scan.close();
	}

}
