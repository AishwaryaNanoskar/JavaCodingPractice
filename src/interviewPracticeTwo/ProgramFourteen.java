package interviewPracticeTwo;

public class ProgramFourteen {
	public static void main(String[] args) {
		int a[] = { 4, 5, 7, 11, 9, 13, 8, 12 };

		int target = 20;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if ((a[i] + a[j]) == target)
					System.out.println("(" + a[i] + "," + a[j] + ")");
			}
		}
	}
}
