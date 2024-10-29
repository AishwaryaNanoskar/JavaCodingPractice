package interviewPracticeTwo;

import java.util.ArrayList;
import java.util.List;

public class ProgramTwentyThree {
	public static void main(String[] args) {
		int arr[] = { 14, 0, 5, 2, 0, 3, 0 };

		List<Integer> arr1 = new ArrayList<Integer>();

		List<Integer> arr2 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr1.add(arr[i]);
			else
				arr2.add(arr[i]);
		}

		arr1.addAll(arr2);
		System.out.println("" + arr1);
	}
}
