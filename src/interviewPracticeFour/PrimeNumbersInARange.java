package interviewPracticeFour;

public class PrimeNumbersInARange {
	public static void main(String[] args) {
		int start = 1, end = 20;

		for (int i = start; i <= end; i++) {
			if (i == 1 || i == 2)
				System.out.println(i);
			else if (i % 2 == 1)
				System.out.println(i);
		}
	}
}
