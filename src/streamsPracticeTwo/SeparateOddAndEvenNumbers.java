package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 2, 7, 8, 5, 9, 10);

		List<Integer> even = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

		System.out.println("Even number is: " + even);

		System.out.println("Odd number is: " + odd);

	}
}
