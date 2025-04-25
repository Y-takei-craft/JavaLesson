
public class Car {
	String modal;
	int speed;
	public void out() {
		System.out.println(modal + speed);
	}
	public static void main(String[]args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.modal = "GTR";
		car2.modal = "スカイライン";
		car1.speed = 100;
		car2.speed = 150;
		car1.out();
		car2.out();
	}
}
