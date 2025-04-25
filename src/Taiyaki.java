
public class Taiyaki {
	String filling;

	public void setFilling(String value) {
		filling = value;
	}

	public void showFilling() {
		System.out.println("このたい焼きの中身は:" + filling + "です。");
	}



	public static void main(String[] args) {
		Taiyaki cream = new Taiyaki();
		Taiyaki anko = new Taiyaki();

		cream.filling = "クリーム";
		anko.filling = "あんこ";

		cream.showFilling();
		anko.showFilling();
	}
}
