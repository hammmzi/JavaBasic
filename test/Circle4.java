package test;

public class Circle4 {

	public static final double PI = 3.14;
	
	//0以下の場合は例外処理
	private double radius;
	
	public Circle4(double radius) throws InvalidSizeException {
		if (radius<=0) {
			throw new InvalidSizeException("半径が０以下です。");
		}
		this.radius = radius;
	}
	
	public double area() {
		return radius * radius * PI;
	}

}
