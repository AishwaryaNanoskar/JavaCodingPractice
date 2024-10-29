package interviewPracticeOne;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "asa";

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		if (str.equals(sb.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
