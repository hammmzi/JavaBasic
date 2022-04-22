import java.util.Scanner;

public class Lesson5_3 {

	public static void main(String[] args) {
		//課題3：平均と合格
		Scanner scan = new Scanner(System.in);
		
		System.out.print("英語：");
		int En = scan.nextInt();
		System.out.print("数字：");
		int Ma = scan.nextInt();
		System.out.print("理科：");
		int Sc = scan.nextInt();

		int sum = En +Ma+Sc;
		double average = (double)sum/3;
		
		System.out.println("合計：" + sum);
		System.out.println("平均：" + average);
		
		scan.close();
	}

}
