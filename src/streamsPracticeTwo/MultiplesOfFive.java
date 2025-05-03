package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOfFive {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 10, 20, 31, 80, 2);
		List<Integer> multiplesOfFive = nums.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());
		System.out.println(multiplesOfFive);
	}

}
