package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(1, 5, 2, 7, 4, 9, 10);
		data.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	}
}
