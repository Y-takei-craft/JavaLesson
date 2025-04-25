import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
    Map<String, List<Integer>> point = new HashMap<>(); // 各科目の点数をリストで保持
    Map<String, Integer> ans = new HashMap<>();
    List<Integer> average = new ArrayList<>();
    String[] kamoku = { "国語", "数学" };

    public void add() {
        for (String subject : kamoku) {
            point.put(subject, new ArrayList<>()); // 各科目に空のリストをセット
            ans.put(subject, 0); // 初期値を0に
        }

        // 点数の追加（複数の値を保持）
        point.get("国語").add(82);
        point.get("国語").add(66);
        point.get("数学").add(65);
    }

    public void math() {
        for (String subject : kamoku) {
            int total = 0;
            int count = 0;
            List<Integer> scores = point.get(subject);
            if (scores != null) {
                for (int value : scores) {
                    total += value;
                    count++;
                }
                ans.put(subject, total);
                average.add(total / count); // 平均計算
            }
        }
    }

    public void showResults() {
        for (int i = 0; i < kamoku.length; i++) {
            System.out.println(kamoku[i] + " の平均: " + average.get(i));
        }
    }

    public static void main(String[] args) {
        Students student = new Students();
        student.add();
        student.math();
        student.showResults();
    }
}