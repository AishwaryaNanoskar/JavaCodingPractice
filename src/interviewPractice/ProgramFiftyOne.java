package interviewPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Write a Java program to remove duplicate elements from the given array. 
Your program or method should take an array of integers as input and should 
return another array which should contain only unique elements from the input array. 
For example, if {4, 3, 2, 4, 9, 2} 
is the input array then your program or method should return {4, 3, 2, 9} as output.*/
public class ProgramFiftyOne {

	public static void main(String[] args) {
		int array[] = { 4, 3, 2, 4, 9, 2 };

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int values : array) {
			if (map.containsKey(values)) {
				map.put(values, map.get(values) + 1);
			} else {
				map.put(values, 1);
			}
		}

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			arrayList.add(key);
		}

		System.out.println(arrayList);

	}

}
