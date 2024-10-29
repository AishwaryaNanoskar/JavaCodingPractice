package interviewPracticeTwo;

import java.util.HashMap;
import java.util.Map;

public class ProgramTwelve {

	public static void main(String[] args) {

		String str = "Java J2EE Java JSP J2EE";

		char c[] = str.replaceAll("\s", "").toLowerCase().toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();
		for (Character count : c) {
			data.put(count, data.getOrDefault(count, 0) + 1);
		}
		System.out.println("Character count is: " + data);
	}

}
