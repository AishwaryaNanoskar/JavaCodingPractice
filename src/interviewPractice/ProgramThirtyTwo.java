package interviewPractice;

import java.util.ArrayList;

//Very imp
/*If ‘n‘ is the positive number and ‘a‘ is an array of integers of length ‘n-1’ 
containing elements from 1 to n. Then find the missing number in ‘a’ in the 
range from 1 to n. Occurrence of each element is only once. For example, If n = 8,
then array ‘a’ will have 7 elements in the range from 1 to 8.
For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing 
in ‘a’ (2 in this case). You have to find out that missing number.*/

public class ProgramThirtyTwo {

	public static void main(String[] args) {

//		int n = 8;

		int array[] = { 4, 5, 3, 7, 8, 6 };

		ArrayList<Integer> missingData = new ArrayList<Integer>();

		for (int n = 1; n <= 8; n++) {
			int countTracker = 0;
			while (countTracker < array.length) {
				if (n == array[countTracker]) {
					break;
				}
				countTracker++;				
			}
			if(countTracker == array.length) {
				missingData.add(n);
			}
		}
		
		System.out.print(missingData);

	}

}
