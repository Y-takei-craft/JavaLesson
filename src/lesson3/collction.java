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
		Set<Integer> mon2 = new HashSet <Integer>();
		for(int b = 0; b < arraylist.size();b++) {
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
		
	}
}
