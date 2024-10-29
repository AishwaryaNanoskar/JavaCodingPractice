package interviewPractice;

/*//Write a Java program to find continuous sub array of the given array 
 * whose sum is equal to a given number. For example, If {12, 5, 31, 9, 21, 8}
 *  is the given array and 45 is the given number, then you have to find 
 *  continuous sub array in this array such that whose elements add up to 45. 
 *  In this case, {5, 31, 9} is such sub array whose elements add up to 45.
*/
public class ProgramFifteen {

	public static void main(String[] args) {
		int a[] = { 12, 5, 31, 9, 21, 8 };

		int target = 45;

		int i = 0;
		while (i <= a.length - 3) {
			if ((a[i] + a[i + 1] + a[i + 2]) == target) {
				System.out.print("(" + a[i] + "," + a[i + 1] + "," + a[i + 2] + ")");
				break;
			} else {
				i++;
			}
		}
	}
}
