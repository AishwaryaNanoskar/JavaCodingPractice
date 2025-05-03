package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfFive {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(0, 5, 3, 7, 10, 15);

		List<Integer> multipleOfFive = data.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());

		System.out.println("Multiples of five are: " + multipleOfFive);
	}
}
