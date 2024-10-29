package interviewPracticeTwo;

public class ProgramTwo {
	public static void main(String[] args) {
		int n = 9;

		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= n; i++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= j; k++) {
				System.out.print(" * ");
			}
			n--;
			System.out.println();
		}
	}
}
