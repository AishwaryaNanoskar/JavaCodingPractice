package interviewPracticeTwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacters {

	public static void main(String[] args) {
		String str = "Aishwarya Akash";

		char c[] = str.replaceAll("\s", "").toLowerCase().toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();
		for (Character a : c) {
			data.put(a, data.getOrDefault(a, 0) + 1);
		}
		System.out.println("Occurence of each characters: " + data);

		Map<Character, Long> data2 = new HashMap<Character, Long>();

		// Streams
		data2 = str.chars().mapToObj(x -> (char) x).map(Character::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Occurence of each characters using streams: " + data2);

		// Average of list of numbers

		List<Integer> list = Arrays.asList(1, 4, 5, 7, 3, 10);
//		System.out.println(list.size());
		double sum = list.stream().reduce((x, y) -> x + y).get();
		double average = sum / list.size();
		System.out.println("average is: " + average);
		double averageNew = list.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);

		System.out.println("Average is: " + averageNew);

		// Flat maps example
		List<List<Integer>> listNew = Arrays.asList(Arrays.asList(1, 5, 3, 8, 6, 9, 10),
				Arrays.asList(2, 7, 11, 14, 12));

		List<Integer> listFlattered = listNew.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Flat map example: " + listFlattered);
		
	}
}
