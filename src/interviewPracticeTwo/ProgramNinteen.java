package interviewPracticeTwo;

public class ProgramNinteen {
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 2, 7, 9, 10 };

		int arr2[] = { 3, 8, 2, 9, 10, 5 };

		System.out.println("Common elements between two arrays are: ");
		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
					continue;
				}
			}
			if (count >= 1)
				System.out.println("" + arr1[i]);
		}

	}
}
