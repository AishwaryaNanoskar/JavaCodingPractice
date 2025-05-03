package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		// Distinct numners in an array
		// Function.identity() - It return the input value
		// Collectors.counting() - Returns a {@code Collector} accepting elements of
		// type {@code T} that
		// counts the number of input elements. If no elements are present, the
		// result is 0
		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 5, 3, 4, 7);
		Map<Integer, Long> frequency = nums.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Distinct Numbers: " + frequency);

	}

}
