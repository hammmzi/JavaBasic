
public class Lesson8_3Ex {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5 ; i++) {
			for (int j = 0; j < i; j++) {
				if(j%2 == 0) {
				System.out.print('●');	
				}else if (j%2 != 0) {
					System.out.print('〇');
				}
				
			}
			System.out.println();
		}
	}

}
