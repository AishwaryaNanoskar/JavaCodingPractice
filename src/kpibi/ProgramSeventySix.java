package kpibi;

import java.util.Scanner;

public class ProgramSeventySix {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		String sideCheck = sc.next();

		char a[] = sideCheck.toCharArray();

		// Converting string to integer
		int num = Integer.parseInt(sideCheck);

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			// converting character value to integer
			int numNew = Character.getNumericValue(a[i]);
			sum = sum + numNew;

		}

		if (num % sum == 0) {
			System.out.println("Harshad Number");
		} else {
			System.out.println("Not Harshad Number");

		}

	}

}
