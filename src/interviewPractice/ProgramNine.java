package interviewPractice;

public class ProgramNine {

	public static void main(String[] args) {

		int num = 456, sum = 0, remainder;

		int sumOfNum = num;

		while (sumOfNum != 0) {
			int lastDigit = sumOfNum % 10;
			sum = sum + lastDigit;
			sumOfNum = sumOfNum / 10;
		}

		System.out.println("" + sum);

	}

}
