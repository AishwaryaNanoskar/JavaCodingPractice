package interviewPractice;

public class ProgramEight {

	public static void main(String[] args) {

		int[] array = { 0, 2, 3, 6, 1, 1 };

		boolean checkDuplicates = false;
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] == array[j]) {
					checkDuplicates = true;
					break;
				} else {
					checkDuplicates = false;
				}
			}
		}

		if (checkDuplicates) {
			System.out.println("The array has duplicate elements");
		} else {
			System.out.println("The array does not have duplicate elements");

		}
	}

}
