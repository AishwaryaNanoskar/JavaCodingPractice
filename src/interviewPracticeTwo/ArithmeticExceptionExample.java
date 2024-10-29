package interviewPracticeTwo;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred: " + e.getMessage());
		} finally {
			System.out.println("This is the example of handling ArithmeticException.");
		}
	}
}
