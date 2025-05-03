package streamsPracticeTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 2, 7, 8, 5, 9, 10, 3, 2, 10);

		Set<Integer> dups = new HashSet<Integer>();

		// Method 1
		list.stream().filter(x -> !dups.add(x)).collect(Collectors.toSet());

		System.out.println("Remove duplicate elements from the list: " + dups);

		// Method 2
		List<Integer> distinctValues = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Distinct values are: " + distinctValues);

	}
}
