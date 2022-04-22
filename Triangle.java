
public class Triangle extends Figure{
	
	int w;
	int h;
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public double area() {
		return w*h*0.5;
		
	}

}
