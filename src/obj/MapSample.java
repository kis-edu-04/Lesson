package obj;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		Map<String,Integer> prefs =new HashMap<>();
		
		prefs.put("京都府",255);
		prefs.put("東京都", 1261);
		prefs.put("熊本", 186);
		
		int Tokyo=prefs.get("東京都");
		System.out.println(Tokyo);
		
		prefs.remove("京都府");
		
//		prefs.put("熊本", 186);
		int kumamoto =prefs.get("熊本");
		System.out.println(kumamoto);
		
		for(String key :prefs.keySet()) {
			int value=prefs.get(key);
			System.out.println(key+"の人口は"+value);
					
		}

	}

}
