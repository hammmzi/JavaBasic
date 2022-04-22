public class ForSample4 {
	public static void main(String[] args) {
		int[][] m = { 
								{ 1, 2, 3 }, 						//0 m[0].length
								{ 10, 20 }, 						//1 m[1].length
								{ 100, 200, 300, 400 } 	//2 m[2].length 
							};
		
		//m[i][j]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}

		//m[i][j]が偶数の時だけprint
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j]%2 == 0) {
					System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
				}
			}
		}
	}
}
