package interviewPracticeFour;

public class Palindrome {
	public static void main(String[] args) {
		String str = "aia";

		String newStr = str.toLowerCase();

		StringBuilder rev = new StringBuilder();
		for (int i = newStr.length() - 1; i >= 0; i--) {
			rev.append(newStr.charAt(i));
		}
		
		if (rev.toString().equals(newStr))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
