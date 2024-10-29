package interviewPracticeTwo;

import java.util.Arrays;

public class ConsecutiveArrayCheck {
	public static void main(String[] args) {
		int arr1[] = { 4, 2, 3, 1 };

		System.out.println(isConsecutiveArray(arr1));
	}

	private static boolean isConsecutiveArray(int[] arr1) {

		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);

		}
		return false;
		// TODO Auto-generated method stub

	}
}
