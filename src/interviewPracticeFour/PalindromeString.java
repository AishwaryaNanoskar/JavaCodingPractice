package interviewPracticeFour;

public class PalindromeString {
	public static void main(String[] args) {

		String str = "RADAR";

		String strCheck = str.toLowerCase();

		StringBuilder sb = new StringBuilder();
		for (int i = strCheck.length() - 1; i >= 0; i--) {
			sb.append(strCheck.charAt(i));
		}

		if (sb.toString().equals(strCheck))
			System.out.println("Palindrome");
		else
			System.out.println("Non - Palindrome");
	}
}
