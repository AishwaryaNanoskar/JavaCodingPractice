package streamsPracticeTwo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInACharacterArray {

	public static void main(String[] args) {
		String inpString = "Aishwarya";
//		Map<Character, Long> occurance = Arrays.stream(inpString.split("")).chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// Approach 1
		Map<String, Long> occurance = Arrays.stream(inpString.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		System.out.println("Occurence of characters in a string Approach 1: " + occurance);

		// Approach 2
		Map<Character, Long> approachTwo = inpString.chars().mapToObj(c -> (char) c)
				.map(s -> s.toLowerCase(s))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Occurence of characters in a string Approach 2: " + approachTwo);

	}

}
