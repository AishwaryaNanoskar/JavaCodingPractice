package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Program to find third highest salary
public class RsystemProgramOne {
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(2000, 4000, 3000, 5000, 6000);
		
		// Method 1
		Integer max = data.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).findFirst().get();
		System.out.println("third highest salary: " + max);

		// Method 2
		data.stream().sorted(Collections.reverseOrder()).limit(3).skip(2).forEach(System.out::println);
		


	}
}
