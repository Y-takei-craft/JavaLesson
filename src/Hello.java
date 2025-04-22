import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hello {
	public static void main(String[]args) {
		System.out.println("こんにちは、Javaの世界!");
		int num = 10;
		System.out.println(num);
		int a = 8;
		int b = 5;
		int sum =  a + b;
		System.out.println(sum);
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println(area);
		String str = "Java";
		double d = 17.0;
		boolean boo = true;
		System.out.print(str + " ");
		System.out.print(d + " ");
		System.out.println(boo);
		Scanner scanner = new Scanner(System.in);
		System.out.print("名前を入力");
		String name = scanner.nextLine();
		System.out.println("こんにちは、" + name + "さん！");
		scanner.close();
		String foermat = String.format("名前:%s、年齢:%d歳、誕生日:%04d-%02d-%02d","武井 優樹",20,2004,07,10);
		System.out.println(foermat);
		int x = 1200;
		int y = 3;
		int z = x * y;
		String foer = String.format("商品:%sは、価格:%d円なので、%d個買うと%d円です。","Laptop",x,y,z );
		System.out.println(foer);
		
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);
		calendar.set(currentYear,Calendar.JULY,10);
		Date jibun = calendar.getTime();
		long differenceInmillis = jibun.getTime() - today.getTime();
		long differenceInDays = differenceInmillis / (1000*60*60*24);
		System.out.println(differenceInDays);
	}
}