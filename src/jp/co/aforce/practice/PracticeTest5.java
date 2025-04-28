package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest5 {
	int r = new java.util.Random().nextInt(3);

	public static void main(String[] args) {
		//		問題1
		PracticeTest5 random = new PracticeTest5();
		int fortune = random.r;
		String message;
		switch(fortune) {
		case 0:
			message = "吉です";
			break;
		case 1:
			message = "中吉です";
			break;
		case 2:
			message = "大吉です";
			break;
		case 3:
			message = "凶です";
			break;
		default:
			message = "";
			break;
		}
		System.out.println(message);

		//		問題2
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + ",");
			}

		}
		System.out.println();

		//		問題3
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.print((a * b) + "	");
			}
			System.out.println();
		}

		//		問題4
		System.out.println();
		int num = 10;
		for (int a = num; a <= num + 9; a++) {
			for (int b = num; b <= num + 9; b++) {
				System.out.print((a * b) + "	");
			}
			System.out.println();
		}
		
//		問題5
		List<String> employees = new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");

		List<String> submitters = new ArrayList<>();
		submitters.add("斎藤");
		submitters.add("高橋");
		
		for(String sub:submitters) {
			employees.remove(sub);
		}
		System.out.println(employees);
		
//		問題6
		int select = 41;
		int judge = 0;
		for(int f = 1;f <= 100;f++) {
			if(select % f == 0) {
				judge ++;
			};
		}
		if(judge == 2) {
			System.out.println(select + "は素数");
		}else {
			System.out.println(select + "は素数じゃない");
		}
	}
}
