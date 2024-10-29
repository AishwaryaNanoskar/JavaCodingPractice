package interviewPracticeOne;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicated {

	public static void main(String[] args) {
		String str = "Aisgshwarya";
		System.out.println(removeDuplicated(str));
	}

	public static String removeDuplicated(String str) {

		// Set to store data
		Set<Character> set = new HashSet<>();

		// StringBuffer to return string
		StringBuffer sf = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			// To fetch specific character
			Character c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();

	}

}
