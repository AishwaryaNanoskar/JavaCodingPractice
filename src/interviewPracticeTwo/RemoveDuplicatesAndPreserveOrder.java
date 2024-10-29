package interviewPracticeTwo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesAndPreserveOrder {
	public static void main(String[] args) {
		String str[] = { "apple", "banana", "apple", "orange", "banana", "kiwi" };

		// Approach 1
		List<String> data = new ArrayList<String>();

		for (String s : str) {
			if (!data.contains(s))
				data.add(s);
		}
		System.out.println("Approach 1: " + data);

		// Approach 2
		Set<String> dataSet = new LinkedHashSet<String>();
		for (String sd : str) {
			dataSet.add(sd);
		}
		System.out.println("Approach 2: " + dataSet);

	}
}
