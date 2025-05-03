package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinInAlist {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(10, 40, 20);

		// Max number
		Integer max = data.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println("Max number is: " + max);

		// Min number
		Integer min = data.stream().sorted().findFirst().get();
		System.out.println("Min number is: " + min);

	}
}
