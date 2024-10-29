package interviewPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a Java program to find the percentage of uppercase letters,
lowercase letters, digits and other special characters(including space) in the given string.*/

public class ProgramThirty {

	public static void main(String[] args) {
		String inputString = "Tiger Runs @ The Speed Of 100 km/hour.";

		char[] inpStr = String.valueOf(inputString).toCharArray();

		int totalChar = inputString.length();

		Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
		Matcher m = p.matcher(inputString);

		/* Upper case logic */
		int countUpperCase = 0;
		for (int i = 0; i < inpStr.length; i++) {
			for (char uppserCase = 'A'; uppserCase <= 'Z'; uppserCase++) {
				if (inpStr[i] == uppserCase) {
					countUpperCase++;
				}
			}
		}

		double upperCasePercentage = (countUpperCase * 100.0) / totalChar;
		System.out.print("Percentage of upper case: " + upperCasePercentage + "\n");

		/* Lower case logic */
		int countLowerCase = 0;
		for (int i = 0; i < inpStr.length; i++) {
			for (char lowerCase = 'a'; lowerCase <= 'z'; lowerCase++) {
				if (inpStr[i] == lowerCase) {
					countLowerCase++;
				}
			}
		}

		double lowerCasePercentage = (countLowerCase * 100.0) / totalChar;
		System.out.print("Percentage of lower case: " + lowerCasePercentage + "\n");

		/* Digits logic */
		int countDigits = 0;
		for (int i = 0; i < inpStr.length; i++) {
//			for (int j = 0; j <=10; j++) {
//				if (inpStr[i] == (char)j) {
//					countDigits++;
//				}
//			}
			if (Character.isDigit(inpStr[i])) {
				countDigits++;
			}
		}
		System.out.print("countDigits: " + countDigits + "\n");

		double digitsPercentage = (countDigits * 100.0) / totalChar;
		System.out.print("Percentage of digits: " + digitsPercentage + "\n");

		/* Secial characters logic */
		int specialChar = 0;
		int totalSpecialChar = inputString.length();

		while (totalSpecialChar != 0) {
			if (m.find()) {
				specialChar++;
			}
			totalSpecialChar--;

		}

		double specialCharPercentage = (specialChar * 100.0) / totalChar;
		System.out.print("Percentage of special charaters: " + specialCharPercentage + "\n");

	}

}
