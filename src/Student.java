
public class Student {
	String name;
	int ave = 0;
	int[] value = { 1, 2, 3, 4, 5 };

	public void student() {
		name = "田中太郎";
	}

	public void mas() {
		for (int i = 0; i < value.length; i++) {
			ave += value[i];
		}
		ave = ave / value.length;
	}

	public void out() {
		System.out.println(name + "の平均は" + ave);
	}

	public static void main(String[]age) {
		Student student = new Student();
		student.student();
		student.mas();
		student.out();
	}
}
