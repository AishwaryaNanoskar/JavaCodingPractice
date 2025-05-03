package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {

	public static void main(String[] args) {
		// Sort List In Reverse Order
		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 5, 3, 4, 7);
		List<Integer> reverseOrder = nums.stream().distinct().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Reverse order numbers: " + reverseOrder);

	}

}
