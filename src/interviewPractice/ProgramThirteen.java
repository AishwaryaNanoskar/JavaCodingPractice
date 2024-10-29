package interviewPractice;

/*Write a Java program to find the largest number ‘L’ less than a given number ‘N’ 
 * which should not contain a given digit ‘D’. For example, If 145 is the given number 
 * and 4 is the given digit, then you should find the largest number less than 145 such 
 * that it should not contain 4 in it. In this case, 139 will be the answer. This 
 * program is one of the logical programs in Java.
*/
public class ProgramThirteen {

	public static void main(String ar[]) throws Exception {

		int num = 145, target = 4;

		String targetCheck = Integer.toString(target);

		for (int i = num; i > 0; i--) {
			String numCheck = Integer.toString(i);
			if (!numCheck.contains(targetCheck)) {
				System.out.println("Largest Number is: " + numCheck);
				break;
			}
		}
	}
}
