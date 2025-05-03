package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeMaxMinFromTheList {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(4, 6, 3, 8, 1, 9, 7, 10);

		// Sum of three max numbers
		Integer sumOfThreeMax = data.stream().sorted(Collections.reverseOrder()).limit(3).reduce((a, b) -> a + b).get();
		System.out.println("Sum of three max numbers: " + sumOfThreeMax);

		// Sum of three min numbers
		Integer sumOfThreeMin = data.stream().sorted().limit(3).reduce((a, b) -> a + b).get();
		System.out.println("Sum of three min numbers: " + sumOfThreeMin);

		// Three max from the list
		System.out.println("Three max numbers: ");
		data.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);

		// Three min from the list
		System.out.println("Three min numbers: ");
		data.stream().sorted().limit(3).forEach(System.out::println);

	}
}
