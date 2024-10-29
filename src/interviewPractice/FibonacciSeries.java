package interviewPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacciSeries(10);

	}

	public static void fibonacciSeries(Integer count) {
		int a = 0, b = 1, c = 1;
		for (int i = 1; i <= count; i++) {
			System.out.println("" + a);

			a = b;
			b = c;
			c = a + b;
		}
	}

}


