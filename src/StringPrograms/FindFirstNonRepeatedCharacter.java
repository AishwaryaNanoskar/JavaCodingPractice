package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "Aishwarya";

		char c[] = str.replaceAll("\\s", "").toLowerCase().toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (Character a : c) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
