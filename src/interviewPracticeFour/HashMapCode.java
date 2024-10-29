package interviewPracticeFour;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {
	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 7, 2, 9, 9 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer data : a) {
			if (map.containsKey(data))
				map.put(data, map.get(data) + 1);
			else
				map.put(data, 1);
		}

		for (Map.Entry entry : map.entrySet()) {
			System.out.println("key is: " + entry.getKey() + " value is: " + entry.getValue());
		}

	}
}
