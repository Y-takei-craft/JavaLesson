package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PracticeTest4 {
	public static void main(String[] args) {
		//		問題2
		List<String> animal = new ArrayList<>();
		animal.add("犬");
		animal.add("猫");
		animal.add("ウサギ");
		animal.add("ヘビ");

		//		問題3
		String a = "犬";
		int han = 0;
		for (String ani : animal) {
			if (ani.contains(a)) {
				han = 1;
			}
			;
		}
		if (han == 1) {
			System.out.println(a + "はリストに含まれています");
		} else {
			System.out.println(a + "はリストに含まれていません");
		}
		
//		問題4
		Calendar cal = Calendar.getInstance();
		int calen = cal.get(Calendar.MONTH)+1;
		String message;
		switch(calen) {
		case 1:
			message = "冬物セール";
			break;
		case 2:
			message = "春物を売る";
			break;
		case 3:
			message = "春物を売る";
			break;
		case 4:
			message = "春物を売る";
			break;
		case 5:
			message = "春物セール";
			break;
		case 6:
			message = "夏物を売る";
			break;
		case 7:
			message = "夏物を売る";
			break;
		case 8:
			message = "夏物セール";
			break;
		case 9:
			message = "秋物を売る";
			break;
		case 10:
			message = "冬物を売る";
			break;
		case 11:
			message = "冬物を売る";
			break;
		case 12:
			message = "冬物を売る";
			break;
		default:
			message = "不正な月です";
			break;
		}
		System.out.println(calen + "は"+ message);
	}
}