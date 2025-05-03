package streamsPracticeTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInList {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(3, 1, 2, 6, 3, 1, 9, 10);
		Set<Integer> set = new HashSet<Integer>();
		data.stream().filter(x -> !set.add(x)).forEach(System.out::println);
	}
}
