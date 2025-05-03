package streamsPracticeTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 5, 3, 2, 4);
		Set<Integer> values = new HashSet<>();
		// !values.add(x) logic won't store the data in the set which are already there
		// and "x" will store them in a
		// list
		List<Integer> collect = nums.stream().filter(x -> !values.add(x))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
