import java.util.InputMismatchException;
import java.util.Scanner;

public class trychach {
	public static void main(String[] args) {
		double ans = 0; // ans も double 型にする

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("整数を入力");
			int str = scanner.nextInt();
			ans = str / 2; // 正しく動作する
			System.out.println("結果: " + ans);
		} catch (InputMismatchException e) { // キャッチする例外を変更
			System.out.println("例外が発生しました: " + e.getMessage());
		}
		try {
			
		}
	}
}