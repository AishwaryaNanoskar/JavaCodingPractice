package Collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateKeysInHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, 26);
		map.put(null, 28);

		System.out.println(map);
		System.out.println(map.size());
	}
}
