package interviewPracticeFour;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int array[] = { 1, 4, 2, 6, 7, 10 };

		int maxDigit = 0, secondMaxDigit = 0;

		if (array[0] > array[1]) {
			maxDigit = array[0];
			secondMaxDigit = array[1];
		} else if (array[1] > array[0]) {
			maxDigit = array[1];
			secondMaxDigit = array[0];
		}

		for (int i = 2; i < array.length; i++) {
			if (array[i] > maxDigit) {
				secondMaxDigit = maxDigit;
				maxDigit = array[i];
			} else if (array[i] < maxDigit && array[i] > secondMaxDigit) {
				secondMaxDigit = array[i];
			}
		}
		System.out.println("Second max digit is: " + secondMaxDigit);

	}
}
