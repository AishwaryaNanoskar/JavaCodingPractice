package interviewPracticeFour;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int num1 = 7, num2 = 8;

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Swapped numbers are num1 is " + num1 + " and num2 is " + num2);
	}
}
