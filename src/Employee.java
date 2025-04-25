
public class Employee {
	int ID;
	String name;
	double salay;
	public void set(){
		ID = 123;
		name = "田中太郎";
		salay = 100000;
	}
	public void mas() {
		salay *= 1.2;
	}
	public void out() {
		System.out.println("ID:" + ID + " 名前:" + name + " 昇給後の給与" + salay);
	}
	public static void main(String[]age) {
		Employee enployee = new Employee();
		enployee.set();
		enployee.mas();
		enployee.out();
	}
}