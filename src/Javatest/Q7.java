package Javatest;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		int age = scanner.nextInt();
		if (age < 0 || age > 100) {
			System.out.println("年齢がエラーです");
		} else if (age <= 3) {
			System.out.println("無料です");
		} else if (age <= 12) {
			System.out.println("500円です");
		} else if (age <= 17) {
			System.out.println("800円です");
		} else if (age <= 59) {
			System.out.println("1200円です");
		} else {
			System.out.println("700円です");
		}
		scanner.close();
	}
}
