package interviewPractice;

/*
 https://javaconceptoftheday.com/java-interview-programs-with-solutions/#google_vignette 
 
 */
public class ProgramFive {

	public static void main(String[] args) {

		int[] arrayOne = { 2, 3, 1, 8, 9 };

		int[] arrayTwo = { 2, 3, 1, 8, 9 };
		
//		int[] arrayTwo = { 8, 3, 1, 7, 9 };

		boolean checkArrayCheck = false;
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					checkArrayCheck = true;
					break;
				} else
					checkArrayCheck = false;
			}
			if (checkArrayCheck)
				System.out.println("The arrays are not equal");
			else
				System.out.println("The arrays are equal");
		} else {
			System.out.println("The arrays are not equal");
		}

	}

}
