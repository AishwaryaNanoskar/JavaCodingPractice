package streamsPracticeTwo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		Character result = input.chars() // Stream of int representing the characters in the String
				.mapToObj(s -> Character.toLowerCase((char) s)) // Convert each int to a char, then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Group
																												// by
																												// char
																												// and
																												// count
																												// occurrences
				.entrySet().stream().filter(entry -> entry.getValue() == 1) // Filter to keep only chars that appear
																				// once
				.map(Map.Entry::getKey) // Get the characters (keys)
				.findFirst() // Get the first character that appears only once
				.get(); // Get the value (first non-repeated character)
		System.out.println(result);

	}
}
