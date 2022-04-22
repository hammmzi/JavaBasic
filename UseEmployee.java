
public class UseEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("木村", "大阪", 2022, 4, 1);
		Employee e2 = new Employee("愛夢", "名古屋", new Day5(2020, 9, 12));
		
		e1.introduce();
		e2.introduce();

	}

}
