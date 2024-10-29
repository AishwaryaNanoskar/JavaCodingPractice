package kpibi;

import java.util.HashMap;
import java.util.Map;

public class ProgramTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java J2EE Java JSP J2EE";

		char c[] = str.replaceAll("\\s", "").toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();

		for (char a : c) {
			data.put(a, data.getOrDefault(data, 0) + 1);
		}

		System.out.println(data);
	}

}
