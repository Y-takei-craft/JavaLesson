import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class matome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ほしい商品を入力");
		String wont = scanner.nextLine();
		Map<String,Integer> mise = new HashMap<>();
		mise.put("リンゴ", 100);
		mise.put("みかん", 80);
		mise.put("バナナ", 120);
		mise.put("いちご", 300);
		Integer select = mise.get(wont);
		if(select != null) {
			System.out.println(wont + ":" + select + "円");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
	}
}