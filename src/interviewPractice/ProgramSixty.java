package interviewPractice;

/*Write a Java program to print Floyd’s Triangle?
*/
public class ProgramSixty {

	public static void main(String[] args) {

		int value = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + "   ");
				value++;
			}
			System.out.println("");
		}

	}

}
