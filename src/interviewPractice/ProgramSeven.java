 package interviewPractice;

public class ProgramSeven {

	public static void main(String[] args) {

		int num = 153, remainder, sum = 0;

		int len = String.valueOf(num).length();

		remainder = num;

		while (remainder != 0) {
			int lastDigit = remainder % 10;
			remainder = remainder / 10;

			int lastDigitToThePowerOfNoOfDigits = 1;

			for (int i = 0; i < len; i++) {
				lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
			}
			sum = sum + lastDigitToThePowerOfNoOfDigits;
		}

		if (sum == num) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Not Amstrong number");
		}
	}

}
