package interviewPractice;

import java.util.ArrayList;

/*Write a Java program to separate zeros from non-zeros in the given array. 
You have to move zeros either to end of the array or bring them to beginning of 
the array. For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then moving 
zeros to end of the array will result 
{14, 5, 2, 3, 0, 0, 0} and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}. 
*/
public class TwentyThree {

	public static void main(String[] args) {

		int[] input = { 14, 0, 5, 2, 0, 3, 0 };

		ArrayList<Integer> valueOne = new ArrayList<Integer>();

		ArrayList<Integer> valueTwo = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				valueOne.add(input[i]);
			}
		}

		for (int j = 0; j < input.length; j++) {
			if (input[j] == 0) {
				valueOne.add(input[j]);
			}
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				valueTwo.add(input[i]);
			}
		}

		for (int j = 0; j < input.length; j++) {
			if (input[j] != 0) {
				valueTwo.add(input[j]);
			}
		}

		System.out.println("Zeros at end: " + valueOne);

		System.out.println("Zeros at first: " + valueTwo);

	}

}
