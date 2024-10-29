package interviewPracticeTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortEvenOddNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 2, 7, 8, 5, 9, 10);

		List<Integer> even = new ArrayList<Integer>();

		List<Integer> odd = new ArrayList<Integer>();

		for (Integer c : list) {
			if (c % 2 == 0)
				even.add(c);
			else
				odd.add(c);

		}

		// Adding list of even and odd numbers
		even.addAll(odd);

		System.out.println(even);

	}

}
