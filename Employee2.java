
public class Employee2 extends Person3 {

	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee2(String name,String department) {
		//親のコンストラクタを呼ぶ
		super(name);
		this.department = department;
	}

	public void introduce() {
		//オーバーライドされてない親のメソッドを呼ぶ
		super.introduce();
		System.out.println("所属は" +department + "です。");
	}

}
