package lesson;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class lesson {
	//		lesson6
	Map<String, List<Integer>> sightseeing = new LinkedHashMap<>();
	List<String> country = new ArrayList<>();
	double count;
	String kuni;
	double a = 0;

	public void set6() {
		sightseeing.put("東京", List.of(150, 250));
		sightseeing.put("大阪", List.of(120, 180));
		sightseeing.put("京都", List.of(80, 120));
		sightseeing.put("福岡", List.of(50, 80));
		sightseeing.put("札幌", List.of(40, 60));
	}

	public void math6() {
		for (Map.Entry<String, List<Integer>> entry : sightseeing.entrySet()) {
			List<Integer> sight = entry.getValue(); // 都市ごとのリストを取得
			count = sight.get(0) + sight.get(1);
			System.out.println(entry.getKey() + " の総来場者数は: " + (int) count + "万人です");
			if (count >= 100) {
				country.add(entry.getKey());
			}
			;
			if (a <= sight.get(1) / count) {
				a = sight.get(1) / count;
				kuni = entry.getKey();
			}
		}
		for (String country : country) {
			System.out.print(country + " ");
		}
		System.out.println("が１００万人を超えました");
		System.out.println("外国人割合が最も高い年は" + kuni + "です");
	}

	//	lesson7
	Map<String,String> name = new LinkedHashMap<>();
	List<Integer> kyuuryou = new ArrayList<>();
	List<Integer> kinmu = new ArrayList<>();
	Map<String,Integer> ave = new LinkedHashMap<>();

	public void set7() {
		name.put("山田太郎","営業部");
		name.put("鈴木花子","開発部");
		name.put("佐藤一郎","営業部");
		name.put("田中美咲","人事部");
		name.put("中村健一","開発部");
		kyuuryou.add(30);
		kyuuryou.add(35);
		kyuuryou.add(28);
		kyuuryou.add(32);
		kyuuryou.add(38);
		kinmu.add(5);
		kinmu.add(3);
		kinmu.add(1);
		kinmu.add(4);
		kinmu.add(7);
	}

	public void math7() {
		for(Map.Entry<String ,String> check : name.entrySet()) {
			if(ave.getKey() == check.getValue()) {
				
			}
		}
	}

	public static void main(String[] args) {
		//		lesson1
		int score = 60;
		if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		//		lesson2
		score = 50;
		boolean submittedReport = true;
		if (score <= 50 || submittedReport) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		//		lesson3
		for (int i = 0; i <= 9; i++) {
			System.out.print(i);
		}
		System.out.println();

		//		losson4
		List<String> kudamono = new ArrayList<>();
		kudamono.add("リンゴ");
		kudamono.add("みかん");
		kudamono.add("ブドウ");
		for (int i = 0; i <= kudamono.size() - 1; i++) {
			System.out.println(kudamono.get(i));
		}

		//		lesson5
		int kazu = 8;
		double kazu1 = kazu;
		kazu1 += 0.555;
		int kazu2 = (int) kazu1;
		System.out.println(kazu);
		System.out.println(kazu1);
		System.out.println(kazu2);

		//		lesson6
		lesson lesson = new lesson();
		lesson.set6();
		lesson.math6();

		//		lesson7
		lesson.set7();
		lesson.math7();
	}
}
