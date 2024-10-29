package interviewPracticeFour;

public class SecondHighest {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 9, 10, 11 };

		int firstHigh = 0, secondHigh = 0;
		if (a[0] > a[1]) {
			firstHigh = a[0];
			secondHigh = a[1];
		} else {
			firstHigh = a[1];
			secondHigh = a[0];
		}

		for (int i = 2; i < a.length; i++) {
			if (a[i] > firstHigh) {
				secondHigh = firstHigh;
				firstHigh = a[i];
			} else if (a[i] < firstHigh && a[i] > secondHigh)
				secondHigh = a[i];
		}

		System.out.println("Second highest number is: " + secondHigh);

	}
}
