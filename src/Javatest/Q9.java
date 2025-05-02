package Javatest;

import java.util.Scanner;

public class Q9 {
	public static void main(String[]args) {
		int syou;
		int gou;
		double discount;
		double pricediscount = 0;
		int numdiscount = 0;
		double tax = 0.1;
		Scanner pricescanner = new Scanner(System.in);
		System.out.print("商品の単価:");
		int price = pricescanner.nextInt();
		Scanner numscanner = new Scanner(System.in);
		System.out.println("購入個数:");
		int num = numscanner.nextInt();
		pricescanner.close();
		numscanner.close();
		syou = price * num;
		if(syou >= 10000) {
			pricediscount = 0.1;
		}else if(syou >= 5000) {
			pricediscount = 0.05;
		};
		if(num >= 5) {
			numdiscount = 100 * num;
		}else if(num >= 3) {
			numdiscount = 50 * num;
		};
		discount = (syou * pricediscount) + numdiscount;
		System.out.println("割引前の合計金額:" + syou + "円");
		System.out.println("割引額:" + (int)discount + "円");
		gou = syou - (int)discount;
		System.out.println("割引後の価格:" + gou + "円");
		System.out.println("消費税額:" + (int)(gou * tax) + "円");
		System.out.println("税込価格" + (int)(gou * (1 + tax)) + "円");
	}
}
