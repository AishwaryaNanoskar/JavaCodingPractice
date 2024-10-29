package interviewPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Campgemini {

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(10, 40, 20);

		Integer max = data.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println("Maximum number is: " + max);

	}

}
