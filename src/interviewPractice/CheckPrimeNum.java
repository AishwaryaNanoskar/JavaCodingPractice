package interviewPractice;

public class CheckPrimeNum {

	public static void main(String[] args) {
		System.out.println("" + checkPrimeNum(11));
		System.out.println("" + checkPrimeNum(1));
		System.out.println("" + checkPrimeNum(0));
		System.out.println("" + checkPrimeNum(12));
		System.out.println("" + checkPrimeNum(7));
		System.out.println("" + checkPrimeNum(8));

	}

	private static boolean checkPrimeNum(Integer num) {
		if (num == 2) {
			return true;
		}

		if (num == 0 || num == 1) {
			return false;
		}

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;

			}
		}

		return true;
	}
}
