package test;

public class UseCircle {

	public static void main(String[] args) {
		
		try {
			Circle4 c1 = new Circle4(0);
			
			System.out.println(c1.area());
		} catch (InvalidSizeException e) {
			e.printStackTrace();
		}

	}

}
