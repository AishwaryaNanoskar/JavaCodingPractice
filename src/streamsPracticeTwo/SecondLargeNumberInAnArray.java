package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeNumberInAnArray {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(1, 4, 3, 7, 8, 19, 22, 44);
		Integer secondMax = data.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println("Second max number is: " + secondMax);
	}
}
