package streamsPracticeTwo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {
	public static void main(String[] args) {
		int list1[] = { 3, 1, 7, 5, 10 };

		int list2[] = { 2, 4, 9, 0 };

		IntStream.concat(Arrays.stream(list1), Arrays.stream(list2)).sorted().forEach(System.out::println);

	}
}
