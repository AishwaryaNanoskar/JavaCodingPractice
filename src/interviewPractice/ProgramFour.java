package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class ProgramFour {

	public static void main(String[] args) {

		String str = "Bright Bright is";

		char[] charArray = str.toCharArray();

		Map<Character, Integer> mapArray = new HashMap<Character, Integer>();

		for (char value : charArray) {
			if (mapArray.containsKey(value)) {
				mapArray.put(value, mapArray.get(value) + 1);
			} else {
				mapArray.put(value, 1);
			}
		}
		System.out.println(""+mapArray);
	}

}
