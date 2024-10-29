package interviewPracticeTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProgramEight {
	public static void main(String[] args) {
		int a[] = { 2, 5, 1, 6, 3, 8, 5, 2 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer m : a) {

			//Approach 1
			if (map.containsKey(m))
				map.put(m, map.get(m) + 1);
			else
				map.put(m, 1);

			// Approach 2
			//map.put(m, map.getOrDefault(m, 0) + 1);
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1)
				System.out.println("Number is: " + entry.getKey());
		}
	}
}
