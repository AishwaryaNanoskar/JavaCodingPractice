package kpibi;

import java.util.Arrays;

public class ProgramFive {

	public static void main(String[] args) {

		int[] arrayOne = { 2, 5, 1, 7, 4 };

		int[] arrayTwo = { 2, 5, 1, 7, 4 };

		// Method 1
		if (arrayOne.length != arrayTwo.length) {
			System.out.println("Both the arrays are not equal");
		} else {
			for (int i = 0; i < arrayOne.length; i++) {
				int count = 0;
				for (int j = 0; j < arrayTwo.length; j++) {
					if (arrayOne[i] == arrayTwo[j]) {
						break;
					} else {
						count++;
						continue;
					}
				}

				if (count == arrayOne.length) {
					System.out.println("Both the arrays are not equal");
				} else if (i == arrayOne.length - 1) {
					System.out.println("Both the arrays are equal");

				} else {
					continue;
				}
			}
		}

		// Method 2
		if (arrayOne.length != arrayTwo.length) {
			System.out.println("Both the arrays are not equal");
		} else {
			Arrays.sort(arrayOne);
			Arrays.sort(arrayTwo);

			boolean equal = true;
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equal = false;
					break;
				}
			}

			if (equal) {
				System.out.println("Both the arrays are equal");
			} else {
				System.out.println("Both the arrays are not equal");

			}
		}

	}

}
