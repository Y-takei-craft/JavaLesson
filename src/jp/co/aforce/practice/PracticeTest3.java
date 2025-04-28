package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		//	問題1
		String a[] = { "シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム" };

		//	問題2
		System.out.println(a[1]);

		//		問題3
		List<String> syain = new ArrayList<String>();
		syain.add("山田太郎");
		syain.add("鈴木花子");
		syain.add("佐藤次郎");
		syain.add("山田太郎");
		syain.add("高橋三郎");

		//		問題5
		System.out.println(syain.get(2));

		//		問題6
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(17);
		list2.add(21);

		list1.addAll(list2);
		list1.sort(Comparator.naturalOrder());
		for (Integer list : list1) {
			System.out.println(list);
		}

		//		問題7
		System.out.println("問題７");
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);

		int size = 0;
		int select = 0;
		if (list1.size() > list3.size()) {
			size = list1.size();
			for (int i = 0; i < size; i++) {
				if (list1.get(i) < list3.get(select)) {
					System.out.println(list1.get(i));
				} else {
					if (list3.get(select) != null) {
						System.out.println(list3.get(select));
						select++;
						System.out.println(list1.get(i));
					}
				}
			}
		} else {
			size = list3.size();
			for (int i = 0; i < size; i++) {
				if (list3.get(i) < list1.get(select)) {
					System.out.println(list3.get(i));
				} else {
					if (list1.get(select) != null) {
						System.out.println(list1.get(select));
						select++;
						System.out.println(list3.get(i));
					}
				}
			}
		}
	}
}