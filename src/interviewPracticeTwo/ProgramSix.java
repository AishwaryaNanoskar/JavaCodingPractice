package interviewPracticeTwo;

import java.util.HashSet;
import java.util.Set;

public class ProgramSix {
	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = "Hitler Woman";

		char a[] = str1.replaceAll("\s", "").toLowerCase().toCharArray();

		char b[] = str2.replaceAll("\s", "").toLowerCase().toCharArray();

		Set<Character> data = new HashSet<Character>();

		// Method 1
		for (Character c : a) {
			data.add(c);
		}
		int count = 0;
		if (a.length != b.length) {
			System.out.println("Not Anagram");
		} else {
			for (Character d : b) {
				if (data.contains(d)) {
					count++;
					continue;
				} else
					break;
			}
		}

		if (count == a.length)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}
}
