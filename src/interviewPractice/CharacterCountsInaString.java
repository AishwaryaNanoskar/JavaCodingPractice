package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountsInaString {
	public static void main(String[] args) {
		String str = "aishwarya";

		char a[] = str.toLowerCase().toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();
		for (Character c : a) {
			//Approach 1
//			if (data.containsKey(c)) {
//				data.put(c, data.get(c) + 1);
//			} else {
//				data.put(c, 1);
//			}
			//Approach 2

			data.put(c, data.getOrDefault(c, 0) + 1);
		}

		System.out.println(data);

	}
}
