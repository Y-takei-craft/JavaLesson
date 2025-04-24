import java.util.ArrayList;
import java.util.List;

public class fortest {
	public static void main(String[] args) {
		List<Integer> valuebox = new ArrayList<Integer>();
		valuebox.add(85);
		valuebox.add(92);
		valuebox.add(78);
		valuebox.add(65);
		valuebox.add(98);
		valuebox.add(70);
		int countvalue = 0;
		for(Integer value:valuebox) {
			if(value >= 70) {
				countvalue += 1;
			};
		};
		System.out.println("70点以上の得点数は" + countvalue + "個です。");
	}
}
