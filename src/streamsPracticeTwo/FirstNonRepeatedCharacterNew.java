 package streamsPracticeTwo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterNew {
	public static void main(String[] args) {
		String str = "This is a school";

		Character data = str.chars().mapToObj(x -> Character.toLowerCase((char) x))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().get();

		System.out.println(data);
	}
}
