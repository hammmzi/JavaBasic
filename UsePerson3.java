
public class UsePerson3 {

	public static void main(String[] args) {
		
		Person3[] persons = {new Person3("スコットメイヤーズ"),
										 new Employee2("S.B.リップマン", "開発部"),
										 new Person3("マーティ・ホール")};
		for (Person3 p : persons) {
			p.introduce();
			System.out.println();
		}
	}

}
