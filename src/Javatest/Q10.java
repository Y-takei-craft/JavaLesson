package Javatest;
public class Q10 {
	public void contains(String[]task) {
		String a = "TASK003";
		String b = "TASK005";
		int aha = 0;
		int bha = 0;
		for(int i = 0;i < task.length;i++) {
			if(task[i] == a) {
				aha = 1;
			}
			if(task[i] == b) {
				bha = 1;
			}
		}
		if(aha == 1) {
			System.out.println("タスクID" + a + "は処理済みです");
		}else {
			System.out.println("タスクID" + a + "は未処理です");
		}
		if(bha == 1) {
			System.out.println("タスクID" + b + "は処理済みです");
		}else {
			System.out.println("タスクID" + b + "は未処理です");
		}
	}
	
	public static void main(String[]args) {
		Q10 contains = new Q10();
		String[] task = {"TASK001","TASC002","TASK003","TASK001","TASK004","TASK002"};
		for(int i = 0;i < task.length;i++) {
			System.out.println("処理済みのタスクIDの一覧 -" + task[i]);
		}
		contains.contains(task);
		System.out.println("処理済みのタスク総数:" + task.length);
	}
}
