package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class DeloitteInterview {

	public static Integer count(String str) {
		char strNew[] = str.toCharArray();

		for (int i = 0; i < strNew.length-1; i++) {
			if (strNew[i] == strNew[i + 1]) {
				return -1;
			} else {
				return 1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		String input = "abcdcaf";

		count(input);
	}

//		String strValue[] = new String[str.length];
//
//		for (int i = 0; i < str.length; i++) {
//			strValue[i] = str[i].toString();
//		}
//
//		Map<String, Integer> strNew = new HashMap<String, Integer>();
//
//		for (int i = 0; i < str.length; i++) {
//			if (strNew.containsKey(str[i])) {
//				strNew.put(str[i], strNew.get(str[i]) + 1);
//			}
//		}
}
