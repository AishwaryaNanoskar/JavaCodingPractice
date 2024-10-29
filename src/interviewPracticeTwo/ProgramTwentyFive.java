package interviewPracticeTwo;

import java.util.ArrayList;
import java.util.List;

public class ProgramTwentyFive {
	public static void main(String[] args) {
		int arr[] = { 14, 9, 11, 7, 8, 5, 3 };

		List<Integer> data = new ArrayList<Integer>();

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
					continue;
				} else {
					count = 0;
					break;
				}
			}
			if (count != 0)
				data.add(arr[i]);

		}
		System.out.println(data);
	}
}
