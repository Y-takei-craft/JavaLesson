package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		//		問題1
		double TAX = 0.1;
		System.out.println(TAX);

		//		問題2
		int x = 480;
		double price = x * (1 + TAX);
		System.out.println(price);

		//		問題3
		String name = "武井";
		System.out.println(name);

		//		問題4
		String kono = "この商品の値段は";
		String en = "円です。";
		System.out.println(kono + price + en);
	}
}