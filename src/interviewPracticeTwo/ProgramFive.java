package interviewPracticeTwo;

import java.util.Arrays;

public class ProgramFive {
	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 2, 3 };

		int b[] = { 4, 5, 6, 2, 3 };

		Arrays.sort(a);
		Arrays.sort(b);

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				count++;
				continue;
			}
			else
				break;
		}
		
		if (count == a.length)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

	}
}
