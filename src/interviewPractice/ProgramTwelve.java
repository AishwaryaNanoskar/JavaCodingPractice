package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class ProgramTwelve {

	public static void main(String[] args) {

		String input = "Java J2EE Java JSP0";

		String value = input.replaceAll("\\s", "").toUpperCase();

		char c[] = value.toCharArray();

		Map<Character, Integer> mapValue = new HashMap<Character, Integer>();

		for (char valueMap : c) {
			if (mapValue.containsKey(valueMap)) {
				mapValue.put(valueMap, mapValue.get(valueMap) + 1);
			} else {
				mapValue.put(valueMap, 1);
			}
		}

		System.out.println(mapValue);
	}

}
