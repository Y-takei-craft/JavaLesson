
public class Rectangle {
	int height;
	int width;
	int ans;
	public void set() {
		height = 5;
		width = 5;
	}
	public void math() {
		ans = height * width;
	}
	public void out() {
		System.out.println(ans);
	}
	public static void main(String[]args) {
		Rectangle rec = new Rectangle();
		rec.set();
		rec.math();
		rec.out();
	}
}
