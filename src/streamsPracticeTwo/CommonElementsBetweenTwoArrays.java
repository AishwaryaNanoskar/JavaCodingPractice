package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		List<Integer> arrayOne = Arrays.asList(6, 3, 4, 9, 3, 10, 56);
		List<Integer> arrayTwo = Arrays.asList(6, 10, 3, 1, 7, 11);

		List<Integer> collect = arrayOne.stream().filter(arrayTwo::contains).distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

}
