package interviewPractice;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program or function to count the occurrences of each element in an array. 
For example, if {12, 9, 12, 9, 10, 9, 10, 11} is 
the input array, then the count of occurrences of each element is {12:2, 9:3, 10:2, 11:1}.*/

public class ProgramFourtySix {

	public static void main(String[] args) {
		int array[] = { 12, 9, 12, 9, 10, 9, 10, 11 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int values : array) {
			if (map.containsKey(values)) {
				map.put(values, map.get(values) + 1);
			} else {
				map.put(values, 1);
			}
		}

		System.out.println(map);
	}

}
