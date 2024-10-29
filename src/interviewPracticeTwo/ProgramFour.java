package interviewPracticeTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramFour {
	public static void main(String[] args) {
		String str = "Better Butter";

		char a[] = str.toLowerCase().replace("\s", "").toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();
		for (Character c : a) {
			if (data.containsKey(c)) {
				data.put(c, data.get(c) + 1);
			} else {
				data.put(c, 1);
			}
		}

		// Duplicate characters in a string
		Set<Character> set = data.keySet();
		for (Character d : set) {
			if (data.get(d) > 1) {
				System.out.println("" + d + ": " + data.get(d));
			}
		}
	}
}
