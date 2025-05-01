package lesson4;
import java.util.Scanner;

public class whilefor {
	public static void main(String[] args) {
		//		while文
		//		問題1
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		//		問題2
		i = 0;
		int ans = 0;
		while (i <= 100) {
			ans = ans + i;
			i++;
		}
		System.out.println(ans);

		//		問題
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int input;
		System.out.println("整数を入力してください (0を入力すると終了します):");

		while (true) {
			input = scanner.nextInt();

			if (input == 0) {
				break;
			}
			sum += input;
		}

		System.out.println("合計値: " + sum);
		scanner.close();
	}
}
