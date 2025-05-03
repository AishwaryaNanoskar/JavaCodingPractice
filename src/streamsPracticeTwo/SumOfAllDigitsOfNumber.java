package streamsPracticeTwo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {

	public static void main(String[] args) {
		int num = 432;

		Integer sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("Sum of all digits of a number: " + sum);

	}

}
