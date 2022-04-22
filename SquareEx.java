public class SquareEx {
	static int edge = 4;
	int height;
	int width;
	
	int area() {
		return height * width;
	}
	
	void setData(int h, int w) {
		height = h;
		width = w;
	}
	
	void setData(int len) {
		height = len;
		width = len;
	}
	
}
