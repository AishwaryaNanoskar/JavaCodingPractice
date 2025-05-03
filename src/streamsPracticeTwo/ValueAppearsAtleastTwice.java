package streamsPracticeTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ValueAppearsAtleastTwice {
	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 1, 2 };
		List<Integer> dataNew = Arrays.stream(data).boxed().collect(Collectors.toList());
		System.out.println(dataNew);
		Set<Integer> set = new HashSet<Integer>(dataNew);
		System.out.println(set);
		if (set.size() == dataNew.size())
			System.out.println(false);
		else
			System.out.println(true);
	}
}
/*
 * o/p - Input: nums = [1,2,3,1] Output: true
 * 
 * Input: nums = [1,2,3,4] Output: false
 */