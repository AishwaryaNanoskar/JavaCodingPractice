package interviewPractice;

public class PowerOfNumbers {

	public static void main(String[] args) {
		int b = 2, p = 4;
		int c = b;

		for (int i = 1; i < p; i++) {
			b = b * c;
		}

		System.out.println(b);

	}

}
