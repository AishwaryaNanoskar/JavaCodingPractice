package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;

public class CubeOnElements {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		integerList.stream().map(x -> x * x * x).filter(x -> x > 50).forEach(System.out::println);
	}
}
