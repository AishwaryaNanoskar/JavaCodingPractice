package streamsPracticeTwo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInAString {
	public static void main(String[] args) {
		String str = "Aishwarya";

		Map<Character, Long> data = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Frequency Of Each Character In A String is: " + data);
	}
}
