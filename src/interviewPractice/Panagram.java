package interviewPractice;

import java.util.HashSet;

public class Panagram {
	public static boolean panagramCheck(String str) {

		HashSet<Character> set = new HashSet<>();

		for (Character c : str.toLowerCase().toCharArray()) {
			if (Character.isLetter(c))
				set.add(c);
		}
		return set.size() == 26;

	}

	public static void main(String[] args) {
		String str = "the quick brown fox jumps over a lazy dog";
		System.out.println(panagramCheck(str) ? "Panagram" : "Not Panagram");
	}
}
