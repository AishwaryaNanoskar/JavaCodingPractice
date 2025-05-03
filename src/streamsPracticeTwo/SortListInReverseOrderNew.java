package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrderNew {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 5, 3);

		List<Integer> sortedReverse = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println("Sorted List In Reverse Order: " + sortedReverse);
	}

}
