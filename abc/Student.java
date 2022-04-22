package abc;

public class Student {
	int no;
	String name;
	
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	
//	public void showInfo() {
//		System.out.println("no: " + no);
//		System.out.println("name: "+ name);
//	}
	
	public String toString() {
		return "no: " + no +"\nname: " + name;
	}

}
