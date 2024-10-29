package interviewPracticeOne;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromStrings {
	public static void main(String[] args) {

		String str1 = "rajesh";

		String str2 = "brajesh";

		char str1Array[] = str1.toCharArray();

		char str2Array[] = str2.toCharArray();

		Set<Character> data1 = new HashSet<>();

		Set<Character> data2 = new HashSet<>();

		for (Character c : str1Array) {
			data1.add(c);
		}

		for (Character a : str2Array) {
			if (data1.contains(a)) {
				data2.add(a);

			}
		}

		System.out.println("Duplicate elments are: " + data2);
	}
}
