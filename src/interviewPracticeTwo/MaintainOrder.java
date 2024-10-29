package interviewPracticeTwo;

import java.util.LinkedHashSet;
import java.util.Set;

public class MaintainOrder {
	public static void main(String[] args) {
		String str = "this is a test this is only a test";

		String strNew[] = str.split(" ");

		String str1[] = new String[strNew.length];

		// Approach 1
		Set<String> dataSet = new LinkedHashSet<String>();
		for (String sd : strNew) {
			dataSet.add(sd);
		}
		System.out.println("" + dataSet);

		// Approach 2
		int k = 0;
		int loopCounter = 0;
		for (int i = 0; i < strNew.length; i++) {
			int count = 0;
			for (int j = 0; j < str1.length; j++) {
				if (strNew[i].equals(str1[j])) {
					break;
				} else {
					count++;
					continue;
				}

			}
			if (count == str1.length) {
				str1[k] = strNew[i];
				k++;
				loopCounter++;
			}
		}
		for (int i = 0; i < loopCounter; i++) {
			System.out.println("" + str1[i]);
		}

	}
}
