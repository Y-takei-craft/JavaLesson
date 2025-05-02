package Javatest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Q11 {
	Map<String, List<Integer>> book = new LinkedHashMap<>();
	List<String> hanbai = new ArrayList<>();
	Map<String,Integer> kouritu = new LinkedHashMap<>();

	public void set() {
		book.put("山田太郎", List.of(1500, 2500));
		book.put("Python入門", List.of(1200, 3000));
		book.put("データ分析の基礎", List.of(800, 4000));
		book.put("AI技術最前線", List.of(2000, 2000));
		book.put("はじめての機械学習", List.of(900, 3500));
	}

	public void math() {
		int all = 0;
		int han = 0;
		String max = null;
		/**
		 * 総販売数の計算
		 */
		for (Map.Entry<String, List<Integer>> entry : book.entrySet()) {
			List<Integer> list = entry.getValue();
			all = list.get(0) * list.get(1);
			System.out.println(entry.getKey() + "の販売総数は" + all + "冊です");

			if (list.get(0) >= 1000) {
				hanbai.add(entry.getKey());
			}
			
			kouritu.put(entry.getKey(),(list.get(1) / list.get(0)));
		}
		/**
		 * 1000殺意上れた書籍
		 */
		System.out.println("以下の書籍が販売数1000冊以上でした");
		for (String hanbai : hanbai) {
			System.out.print(hanbai + "	");
		}
		System.out.println();
		
		/**
		 * 効率の用意商品
		 */
		for(Map.Entry<String,Integer> kou:kouritu.entrySet()) {
			if(han < kou.getValue()) {
				han = kou.getValue();
				max = kou.getKey();
			}
		}
		System.out.println("もっと効率よく売れた商品は:" + max);

	}

	public static void main(String[] args) {
		Q11 book = new Q11();
		book.set();
		book.math();
	}
}
