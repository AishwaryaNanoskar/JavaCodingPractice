package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArraysUsingCollection {
	public static void main(String[] args) {
		Integer[] arr = { 1, 4, 6, 8, 9, 12 };

		List<Integer> list = Arrays.asList(arr);
		Collections.shuffle(list);
		list.toArray(arr);
		System.out.println(list);

	}
}
