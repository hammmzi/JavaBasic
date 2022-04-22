
public class UsePerson {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person2 p1 = new Person2();
		p1.setName("Jhon Lemon");
		//p1.name = "Jhon Lemon";
		p1.setAge(40);
		//p2.age = 40;
		
		Person2 p2 = new Person2();
		p2.setName("$U+*;URI");
		p2.setAge(-400);
		
		System.out.println("私の名前は" + p1.getName() + "です。年齢は" + p1.getAge() +"です。");
		System.out.println("私の名前は" + p2.getName() + "です。年齢は" + p2.getAge() +"です。");
		
	}

}
