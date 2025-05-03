package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeNumber {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(4, 6, 3, 8, 1, 9, 7, 10);
		Integer secondLargeNumber = data.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second large number: " + secondLargeNumber);
	}
}
