package interviewPracticeTwo;

import java.util.HashMap;
import java.util.Map;

public class Sub {
	public static void main(String[] args) {
		String str = "Akash Das Gupta";

		String s = str.replace("\s", "");

		int count = 1;

		Map<String, Integer> map = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				System.out.println(s.charAt(i) + " = " + count);
				count = 1;
			}
		}

	}

}
