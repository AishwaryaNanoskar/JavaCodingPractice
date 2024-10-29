package interviewPractice;

/*Write a Java program to find second largest number in an array of numbers.
 * Important program
*/
public class ProgramTen {

	public static void main(String[] args) {

		int array[] = { 985, 521, 975, 831, 479, 861 };

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
				secondMaxDigit = maxDigit;// 51
				maxDigit = array[i];// 75
			} else if (array[i] < maxDigit && array[i] > secondMaxDigit) {
				secondMaxDigit = array[i];
			}
		}

		System.out.println("Second Max digit is: " + secondMaxDigit);

	}

}

