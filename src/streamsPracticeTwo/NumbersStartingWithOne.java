package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWithOne {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(11, 51, 12, 71, 41, 19, 10);
		data.stream().map(s -> s + "").filter(x -> x.startsWith("1")).forEach(System.out::println);
	}
}
