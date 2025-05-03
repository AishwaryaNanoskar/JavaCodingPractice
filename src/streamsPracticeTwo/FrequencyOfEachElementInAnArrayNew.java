package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInAnArrayNew {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 5, 3, 4, 7);
		Map<Integer, Long> data = nums.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency Of Each Element In An Array: " + data);
	}

}
