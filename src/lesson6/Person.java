package lesson6;


public class Person {
//	問題1
	String name;
	int age;
	public void set(String value) {
		name = "value";
		age =  0;
	}
	
	public void out() {
		System.out.println(name + age);
	}
	public static void main(String[]value) {
	Person nameage = new Person();
	nameage.name = "何も入ってないよ";
	nameage.age = 0;
	nameage.out();
	}
}
