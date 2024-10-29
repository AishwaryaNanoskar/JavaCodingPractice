package kpibi;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Array rotation means you need to rotate an array in left or right direction by 
 * ‘n’ positions. For example, if {1, 2, 3, 4, 5, 6, 7} is an input array then rotating 
 * this array in the left direction by two positions will give {3, 4, 5, 6, 7, 1, 2} and 
 * rotating in the right direction by two positions will give {6, 7, 1, 2, 3, 4, 5}. 
*/
public class ProgramSixtySeven {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };

		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Enter which from which side the array should roate: ");
		Scanner sc = new Scanner(System.in);
		String sideCheck = sc.next();
		System.out.println("Enter how many places should we roate: ");
		// how many element to move
		int n = sc.nextInt();

		if (sideCheck.toUpperCase().equals("LEFT")) {
			// loop to check how many times should the array be roatated
			for (int i = 0; i < n; i++) {
				// Assigning index 0 value to temp
				int temp = a[0];
				for (int j = 0; j < a.length - 1; j++) {
					// assigning index 1 vale to index 0 and so on
					a[j] = a[j + 1];
				}
				// assigning index 0 value which was assigned to temp to last index i.e 6
				a[a.length - 1] = temp;
			}
			System.out.println("Array rotate to the left is: " + Arrays.toString(a));

		} else if (sideCheck.toUpperCase().equals("RIGHT")) {
			int tempNew;
			// loop to check how many times should the array be roatated
			for (int i = 1; i <= n; i++) {
				// Assigning last index value to temp
				tempNew = inputArray[inputArray.length - 1];

				for (int j = inputArray.length - 1; j > 0; j--) {
					// assigning index 5 value to index 6 and so on
					inputArray[j] = inputArray[j - 1];
				}
				// assigning last index value which was assigned to tempNew to in inputArray[0]
				inputArray[0] = tempNew;
			}
			System.out.println("Array rotate to the right is: " + Arrays.toString(inputArray));
		}

	}

}
