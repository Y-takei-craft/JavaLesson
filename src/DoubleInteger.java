
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
		
//		問題11
		int num11 = 10;
		int num12 = 4;
		System.out.println(num11 - num12);
		
//		問題12
		int num13 = 6;
		int num14 = 7;
		System.out.println(num13 * num14);
		
//		問題13
		String name = "take";
		int age = 20;
		System.out.println(name + "は次の誕生日で" + (age+1)  +"歳です。");
		
//		問題14
		int num15 = 8;
		int num16 = 3;
		System.out.print("足し算:" + (num15+num16)+" ");
		System.out.print("引き算:" + (num15-num16)+" ");
		System.out.print("掛け算:" + (num15*num16)+" ");
		System.out.print("割り算:" + (num15/num16)+" ");
		System.out.println("あまり:" + (num15%num16)+" ");
		
//		問題15
		int test = 75;
		int test1 = 88;
		int test2 = 92;
		int sum = test + test1 + test2;
		System.out.println("平均値:" + (sum/3));
		
//		問題16
		int sell = 12000;
		System.out.println(sell * 0.7);
	}
}