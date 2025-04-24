import java.util.HashMap;
import java.util.Map;

public class CountryCapital {
	public static void main(String[] args) {
		Map<String, String> country = new HashMap<>();
		country.put("日本", "東京");
		country.put("アメリカ合衆国", "ワシントンD.C.");
		country.put("フランス", "パリ");
		country.put("中国", "北京");
		
		for(String coun:country.keySet()){
		System.out.println(coun + ":" + country.get(coun));
		}
		
		for (String key : country.keySet()) {
			if (key.contains("日"))
				System.out.print(key + country.get(key));
		}
	}
}
