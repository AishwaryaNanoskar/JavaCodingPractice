package interviewPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

//		String str = "Aishwarya";
//
//		System.out.println("" + reverse(str));
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.next();
		System.out.println("Reverse String is: "+reverse(str));
	}

	public static String reverse(String str) {

		char c[] = str.toCharArray();

		StringBuilder strRev = new StringBuilder();

		for (int i = c.length - 1; i >= 0; i--) {
			strRev.append(c[i]);
		}
		return strRev.toString();

	}

}
