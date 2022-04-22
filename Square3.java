
public class Square3 {

	static int edge = 4;
	
	int height;
	int width;
	
	static int area(int h, int w) {
		int area = h * w;
		return area;
	}
	
	void setData(int h, int w) {
		height = h;
		width = w;
		
	}
	
	void setData(int len) {
		width = len;
		height = len;
		
	}
	
}
