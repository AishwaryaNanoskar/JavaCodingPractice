package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;

public class SumAverageOfAllELementsInAnArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 2, 6, 4, 9, 6, 10);

		// Sum of all elements of an array
		Integer sum = list.stream().reduce(Integer::sum).get();
		System.out.println("Sum is: " + sum);

		// Average of all elements of an array
		System.out.println(list.stream().mapToInt(Integer::intValue).average());
	}
}
