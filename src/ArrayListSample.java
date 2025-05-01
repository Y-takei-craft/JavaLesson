import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListSample {
	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<String>();
		fruitsList.add("apple");
		fruitsList.add("potao");
		fruitsList.add(1,"grape");
		fruitsList.add(1,"peach");

		System.out.println(fruitsList);
		
		String element1 = fruitsList.get(0);
		String element2 = fruitsList.get(2);
		System.out.println("0番目の要素:" + element1);
		System.out.println("2番目の要素:" + element2);
		
		fruitsList.remove(2);
		System.out.println(fruitsList);
		fruitsList.remove("peach");
		System.out.println(fruitsList);
		
		Set<Integer> numList = new HashSet <Integer>();
		numList.add(2);
		numList.add(1);
		numList.add(1);
		numList.add(3);
		System.out.println(numList);
		
		Map<String,Integer> nameMap = new HashMap<>();
		nameMap.put("Bob", 1);
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		System.out.println(nameMap);
		
		Integer value = nameMap.get("Alice");
		System.out.println(value); 
		
		Integer value2 = nameMap.get("Tarou");
		System.out.println(value2);
		
		nameMap.remove("Alice");
	}
}
