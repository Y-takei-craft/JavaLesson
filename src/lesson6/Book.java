package lesson6;

public class Book {
	//	問題2
	String title;
	String author;
	int price;

	public void set(String value) {
		title = "";
		author = "";
		price = 0;
	}

	public void showInfo() {
		System.out.println(title + ":" + author + ":" + price + "円");
	}

	public static void main(String[] age) {
		Book show = new Book();
		show.title = "ゾロリ";
		show.author = "原豊";
		show.price = 500;
		show.showInfo();
	}
}
