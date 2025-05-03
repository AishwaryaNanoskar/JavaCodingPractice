package streamsPracticeTwo;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String input = "Java Articles are Awesome";
		input.chars().mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue() > 1L)
				.map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);

	}

}
