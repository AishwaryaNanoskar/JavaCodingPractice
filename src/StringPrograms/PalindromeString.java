package StringPrograms;

public class PalindromeString {
	public static void main(String[] args) {
//		String str = "isity";

		String str = "isI";

		String strPali = str;

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		if (sb.toString().equalsIgnoreCase(strPali))
			System.out.println("Given string is Palindrome");
		else
			System.out.println("Given string is not Plaindrome");
	}
}
