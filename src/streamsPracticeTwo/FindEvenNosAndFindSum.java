package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;

public class FindEvenNosAndFindSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		Integer sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
		System.out.println("Even numbers sum is: " + sum);

	}
}
