package interviewPractice;

/*
Write a Java program to take input number from the user, reverse it and add 
it to itself. If the sum is not a palindrome then repeat the procedure until you get a palindrome
*/

public class ProgramTwentySix {

	public static void main(String ar[]) throws Exception {

		int number = 7325;

		int rem = 0, reverse = 0;

		int origin = number;

		while (number != 0) {
			rem = number % 10;

			reverse = (reverse * 10) + rem;

			number = number / 10;
		}

		int sum = reverse + origin;

		System.out.println("Sum is: " + sum);
	}
}
