import java.util.ArrayList;

public class While {
	public static void main(String[] args) {
		int i = 5;
		while (i < 5) {
			System.out.println("iの値" + i);
			i++;
		}
		;

		i = 5;
		do {
			System.out.println("iの値:" + i);
			i++;
		} while (i < 5);
		
		for(i = 0 ; i <= 10 ; i++) {
			for(int j = 0;j <= i;j++) {
				System.out.println(i);
			}
		};
		ArrayList<String>employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		for(String employee:employees) {
			System.out.println(employee);
		}
	}
}
