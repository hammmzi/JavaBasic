
public class Circle3 extends Figure{

	static double pi = 3.14;
	double r;
	
	public Circle3(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return r*r*pi;
		
	}

}
