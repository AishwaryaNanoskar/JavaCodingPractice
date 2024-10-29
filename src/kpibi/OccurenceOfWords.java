package kpibi;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {
	public static void main(String[] args) {
		String arr[] = { "aish", "akash", "sona", "mom", "aish"};

		Map<String, Integer> data = new HashMap<String, Integer>();
		for (String s : arr) {
			if (data.containsKey(s)) {
				data.put(s, data.get(s) + 1);
			} else {
				data.put(s, 1);
			}
		}

		System.out.println(data);

	}
}
