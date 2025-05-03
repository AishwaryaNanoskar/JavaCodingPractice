package streamsPracticeTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeNum {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(6, 3, 4, 9, 3, 10, 56);
		int secondLargeNum = nums.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Largest Number is: " + secondLargeNum);
		
	}

}
