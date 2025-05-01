package lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class collction {
	public static void main(String[] args) {
		//		コレクション
		//		問題1
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		for (int a = arraylist.size() - 1; a > 0; a--) {
			System.out.print(arraylist.get(a));
		}
		System.out.println(arraylist.get(0));

		//		問題2
		Set<Integer> mon2 = new HashSet<Integer>();
		for (int b = 0; b < arraylist.size(); b++) {
			mon2.add(Integer.parseInt(arraylist.get(b)));
		}
		System.out.println(mon2);

		//		問題3
		List<String> fruit = new ArrayList<String>();
		fruit.add("りんご");
		fruit.add("バナナ");
		fruit.add("さくらんぼ");
		fruit.remove("バナナ");
		fruit.add("オレンジ");
		System.out.println(fruit);

		//		リスト
		//		問題1
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("1");
		linkedlist.add("2");
		linkedlist.add("3");
		System.out.println(linkedlist.get(0) + "," + linkedlist.get(linkedlist.size() - 1));

		//		問題2
		int atai = 5;
		int han = 0;
		LinkedList<Integer> search = new LinkedList<>();
		search.add(1);
		search.add(2);
		search.add(3);
		search.add(4);
		search.add(5);
		for (int i = 0; i <= search.size() - 1; i++) {
			if (atai == i) {
				han = 1;
			} else {
				han = 0;
			}
		}
		if (han == 1) {
			System.out.println("含まれている");
		}else {
			System.out.println("含まれていない");
		}
		
//		問題3
		List<String> rist = new ArryaList<>();
		

		//		問題2
		List<String> moji = new ArrayList<>();
		moji.add("あ");
		moji.add("い");
		moji.add("う");
		moji.add("え");
		moji.add("お");
		System.out.println(moji);

		//		問題3
		String[] student = { "田中", "山田", "佐藤" };
		Integer[] spec = { 100, 20, 60 };
		int tenp = 0;
		for (int i = 0; i <= spec.length - 1; i++) {
			tenp += spec[i];
		}
		System.out.print(tenp / spec.length);
	}
}
