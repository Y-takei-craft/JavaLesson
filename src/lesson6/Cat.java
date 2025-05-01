package lesson6;

public class Cat {
	String name;
	void meow() {
		System.out.println(name + "が鳴いた!");
	}
	public static void main(String[]args) {
		Cat cat = new Cat();
		cat.name = "猫";
		cat.meow();
	}
}
