package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringListInIncreasingOrder {
	public static void main(String[] args) {
		List<String> data = Arrays.asList("Aishwarya", "Akash", "Mitali", "Asmita", "Uttam", "Aishwarya Nanoskar");
		data.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
}
