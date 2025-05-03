package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 4, 5, 2, 3, 1, 7, 8, 9, 6, 6, 2);

		Set<Integer> dups = new HashSet<>();
		
		//
//		 Approach 1
		Set<Integer> data = list.stream().filter(x -> !dups.add(x)).collect(Collectors.toSet());
		System.out.println(data);

//		// Approach 2
//		Set<Integer> data2 = list.stream().filter(x -> Collections.frequency(list, x) > 1)
//				.collect(Collectors.toSet());
//		System.out.println(data2);

	}

}
