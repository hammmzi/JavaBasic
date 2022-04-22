public class ShowPrice2 {
	public static void main(String[] args) {
		
		int price1 = 500;
		int price2 = 800;
		double discount = 0.8;
		
		price1 = clacTax(price1, discount);
		System.out.println("1つ目の商品は" + price1 + "です。");
		
		
		price2 = clacTax(price2, discount);
		System.out.println("2つ目の商品は" + price2 + "です。");
		
//		Scanner scan = new Scanner(System.in);
//		
//		int price;
//		double discount = 0.8;
//		System.out.print("製品の値段を入力してください：");
//		price = scan.nextInt();
//		
//		price = clacTax(price, discount);
//		System.out.println("選択した商品は" + price + "です。");
//		
//		scan.close();
	}
	static int clacTax(int price, double discount) {

		double discountPrice = price *discount;
		double tax = 0.1;
		double taxPrice = discountPrice * (1 + tax);
		return (int)taxPrice;

	}
}
