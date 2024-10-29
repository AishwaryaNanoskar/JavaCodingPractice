package kpibi;

import java.io.IOException;

public class ProgramSeven {
	public static void main(String sr[]) throws IOException {
		
		//Method 1
		int num = 153, cube = 3, sum = 0;

		int dupRemainder = num;

		while (dupRemainder != 0) {
			int lastDigit = dupRemainder % 10;
			dupRemainder = dupRemainder / 10;

			int cubeOfNum = 1;
			for (int i = 0; i < cube; i++) {
				cubeOfNum = cubeOfNum * lastDigit;
			}
			sum = sum + cubeOfNum;
		}

		if (sum == num)
			System.out.println("Amstrong number");
		else
			System.out.println("Not Amstrong number");
		
		//Method 2
		int numInp = 153; // Example number
        int numDigits = String.valueOf(numInp).length(); // Number of digits in the number
        int sumOfNum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            numInp += Math.pow(digit, numDigits); // Adding the cube of the digit to sum
            temp /= 10;
        }

        if (sumOfNum == numInp)
            System.out.println("Amstrong number");
        else
            System.out.println("Not Amstrong number");

	}
}
