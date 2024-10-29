package interviewPracticeTwo;

public class ProgramTen {
	public static void main(String[] args) {

		int a[] = { 10, 14, 26, 45, 19 };

		int firstHighest = 0, secondHighest = 0;

		if (a[0] > a[1]) {
			firstHighest = a[0];
			secondHighest = a[1];
		} else {
			firstHighest = a[1];
			secondHighest = a[0];
		}

		for (int i = 2; i < a.length; i++) {
			if (a[i] > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = a[i];
			} else if (a[i] < firstHighest && a[i] > secondHighest)
				secondHighest = a[i];
		}

		System.out.println("Second highest number is: " + secondHighest);
	}
}
