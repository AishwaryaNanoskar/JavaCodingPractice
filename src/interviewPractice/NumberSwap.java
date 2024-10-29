package interviewPractice;

public class NumberSwap {

	public static void main(String[] args) {
		int a = 10, b = 20;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Number a is: " + a + " and Number b is: " + b);

	}

}
