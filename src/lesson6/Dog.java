package lesson6;

public class Dog {
	String dog;
	public void bark() {
		dog = "ワン!";
	}
	public void out(){
		System.out.println(dog);
	}
	public static void main(String[]aegs) {
		Dog dog = new Dog();
		dog.bark();
		dog.out();
	}
}
