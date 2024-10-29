package interviewPractice;

import java.util.Scanner;

/*Write a Java program to perform matrix operations like matrix addition, 
matrix subtraction, matrix multiplication and transpose of a matrix. 
This program is one of the matrix related Java programs asked in interview.
*/
public class ProgramEleven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();

		int matrix[][] = new int[row][col];

		System.out.println("Enter Matrix Data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your Matrix is : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + "\t");
			}

			System.out.println();
		}
	}

}
