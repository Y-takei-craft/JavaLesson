package Javatest;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
	public static void main(String[]args) {
		List<String> fruit = new ArrayList<>();
		fruit.add("リンゴ");
		fruit.add("バナナ");
		fruit.add("さくらんぼ");
		
		fruit.remove("バナナ");
		fruit.add("オレンジ");
		System.out.println(fruit);
	}

}
