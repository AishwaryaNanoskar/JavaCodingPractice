package interviewPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcabcde";

		List<Character> data = new ArrayList<>();
		List<Integer> dataCount = new ArrayList<>();

		int count = 0, i = 0;
		while (i < str.length()-1) {
			if (!data.contains(str.charAt(i)) && !(str.charAt(i) == str.charAt(i + 1))) {
				data.add(str.charAt(i));
				count++;
			} else {
				dataCount.add(count);
				count = 0;
				data.clear();
				data.add(str.charAt(i));
			}
			i++;
			
			//The last element length is not considered hence, this condition is required.
			if (i == str.length() - 1) {
				dataCount.add(count + 1);
			}
		}

		System.out.println("Max count is: " + Collections.max(dataCount));

	}
}
