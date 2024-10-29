package kpibi;

import java.util.Scanner;

/*Int vs Long
The int and long data types are both used to store integer values, but they differ in their
size and range: int is a 32-bit data type and can hold values from -2,147,483,648 to 2,147,483,647. 
long is a 64-bit data type and can hold values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
*/
class Utility {

	public static boolean isNumber(String input) {
		// TODO Auto-generated method stub
		try {
			Long.parseLong(input);
//			Integer.parseInt(input);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}

public class ProgramTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile no: ");
		String input = sc.next();

//		String input = "7767934909";
		if (Utility.isNumber(input.replaceAll("\\s+", "")) && (input.length() == 10)) {
			System.out.println("The entered mobile number is correct!!");
		} else {
			System.out.println("Sorry!!!! The entered mobile number is not correct!!");
		}
	}

}
