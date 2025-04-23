import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String[] args) {
		int z = 11;
		List<String> fruitsList = new ArrayList<String>();
		if (z > 10) {
			fruitsList.add("large");
		} else {
			fruitsList.add("small");
		}
		;
		System.out.println(fruitsList);
	}
}