package kpibi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProgramOneHunderedEleven {
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";

		char newStr[] = str.replaceAll("\\s", "").toLowerCase().toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();

		for (char a : newStr) {
			// data.getOrDefault(a, 0) will set the initial value to zero and increment to
			// one everytime the value is already present in the Map
			data.put(a, data.getOrDefault(a, 0) + 1);
		}

		System.out.println(data);

		// Set to iterate the HashMap
		Set<Entry<Character, Integer>> entrySet = data.entrySet();

		int maxCount = 0;
		char maxChar = 0;

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		System.out.println("Max value is: " + maxCount + " Character is: " + maxChar);

	}
}
