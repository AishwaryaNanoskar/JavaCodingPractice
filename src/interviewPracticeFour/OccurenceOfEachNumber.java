package interviewPracticeFour;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		for (Integer d :  a) {
			if (data.containsKey(d))
				data.put(d, data.get(d) + 1);
			else
				data.put(d, 1);
		}
		System.out.println(data);
	}
}
