
public class UseFigure {

	public static void main(String[] args) {
		
		Figure[] figures = {new Triangle(3,4), new Circle3(4), new Square5(3,30)};
		
		for (int i = 0; i < figures.length; i++) {
			System.out.println("図形"+(i+1) +"の面積："+ figures[i].area());
		}
	}

}
