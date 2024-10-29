package kpibi;

import java.util.ArrayList;
import java.util.List;

/*
 * If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ containing 
 * elements from 1 to n. Then find the missing number in ‘a’ in the range from 1 to n. 
 * Occurrence of each element is only once. For example, If n = 8, then array ‘a’ will have 7 elements 
 * in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). 
 * You have to find out that missing number.
*/
public class ProgramThirtyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 8;

		int array[] = { 1, 4, 5, 3, 7, 8, 6 };

		List<Integer> data = new ArrayList<Integer>();

		for (int j = 0; j <= 8; j++) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == j) {
					break;
				} else {
					count++;
				}
			}
			if (count == array.length) {
				data.add(j);
			}
		}

		System.out.println("Missing numbers are: " + data);
	}
}
