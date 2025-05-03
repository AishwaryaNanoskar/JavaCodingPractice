package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(6, 3, 4, 9, 3, 10, 56);

		// Max number
		int maxNum = nums.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max number is: " + maxNum);

		// Min number
		int minNum = nums.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Min number is: " + minNum);
	}

}
