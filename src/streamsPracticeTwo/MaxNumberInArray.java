package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumberInArray {
	public static void main(String[] args) {

		// Method 1
		List<Integer> data = Arrays.asList(1, 4, 2, 6, 8, 3, 9);
		Integer max = data.stream().sorted(Collections.reverseOrder(null)).findFirst().get();
		System.out.println("Maximum number is: " + max);

		// Method 2
		Integer maximum = data.stream().max((i, j) -> i.compareTo(j)).get();
		System.out.println("Maximum number is: " + maximum);

	}
}
