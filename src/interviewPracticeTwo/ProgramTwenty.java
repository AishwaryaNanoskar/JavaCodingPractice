package interviewPracticeTwo;

import java.util.Scanner;

public class ProgramTwenty {
	public static void main(String[] args) {
		System.out.println("Enter your mobile number: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		if (checkMobNum(num.replaceAll("\\s+", "")) && num.length() == 10)
			System.out.println("The entered mobile number is correct!!");
		else
			System.out.println("Sorry!!!! The entered mobile number is not correct!!");

	}

	public static boolean checkMobNum(String num) {
		try {
			Long.parseLong(num);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
