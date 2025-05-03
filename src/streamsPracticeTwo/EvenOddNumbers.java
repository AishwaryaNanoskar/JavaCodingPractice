package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 5, 3);

		// Even Numbers
		List<Integer> even = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers are: " + even);

		// Even Numbers
		List<Integer> odd = nums.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers are: " + odd);
	}

}
