
public class DoubleInteger {
	public static void main(String[] args) {
		//	問題１
		int num = 5;
		System.out.println(num * 2);

		//	問題２
		int num1 = 12;
		if (num1 > 12) {
			System.out.println("大きい");
		} else {
			System.out.println("小さい");
		}
		;

		//	問題３
		int num2 = 7;
		if (num2 % 2 == 1) {
			System.out.println("奇数");
		} else {
			System.out.println("偶数");
		}
		;

		//	問題４
		double num3 = 4.5;
		System.out.println(num3 / 2);

		//	問題５
		double num4 = 7.8;
		System.out.println((int) num4);
		System.out.println(num4 - ((int) num4));

		//		問題６
		double num5 = 3.2;
		System.out.println(num5 * 10);

		//		問題７
		int num6 = 0;
		if (num6 == 0) {
			System.out.println("0です");
		} else {
			System.out.println("0以外です");
		}
		;

		//		問題８
		int num7 = -5;
		if (num7 < 0) {
			System.out.println("負の値");
		} else {
			System.out.println("性の値");
		}

		//		問題９
		int num8 = 15;
		if(num8 % 5 == 0) {
			System.out.println("５の倍数だよ");
		}else {
			System.out.println("5の倍数じゃないよ");
		};
		
//		問題10
		int num9 = 8;
		int num10 = 3;
		System.out.println(num9 + num10);
	}
}