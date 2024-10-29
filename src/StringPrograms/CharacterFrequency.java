package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str = "Aishwarya";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character a : str.replaceAll("\\s", "").toLowerCase().toCharArray()) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		System.out.println(map);
	}
}
