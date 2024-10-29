package kpibi;

public class ProgramTen {

	public static void main(String[] args) {

		int a[] = { 45, 51, 28, 75, 49, 42 };

		int firstMax = 0, secondMax = 0;

		if (a[0] > a[1]) {
			firstMax = a[0];
		} else {
			secondMax = a[1];
		}

		for (int i = 2; i < a.length; i++) {
			if (a[i] > firstMax) {
				secondMax = firstMax;
				firstMax = a[i];
			} else if (a[i] < firstMax && a[i] > secondMax) {
				secondMax = a[i];
			}
		}

		System.out.println("First max: " + firstMax + " Second max: " + secondMax);

	}

}
