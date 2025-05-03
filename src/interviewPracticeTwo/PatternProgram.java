package interviewPracticeTwo;

/*
 * 
1
12
1234
12345
123456
 * 
 * */
public class PatternProgram {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int k = n-i; k > 1; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
