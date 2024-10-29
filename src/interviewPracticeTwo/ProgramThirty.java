package interviewPracticeTwo;

public class ProgramThirty {
	public static void main(String[] args) {
		String str = "Tiger Runs @ The Speed Of 100 km/hour.";

		char a[] = str.toCharArray();

		double totalCharacters = str.length();

		// Percentage of upper case characters
		double upperCaseCount = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			for (int i = 0; i < a.length; i++) {
				if (c == a[i]) {
					upperCaseCount++;
				}
			}
		}
		System.out.println("Percentage of upper case characters is: " + (upperCaseCount * 100) / totalCharacters);

		// Percentage of lower case characters
		double lowerCaseCharacters = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			for (int i = 0; i < a.length; i++) {
				if (c == a[i]) {
					lowerCaseCharacters++;
				}
			}
		}
		System.out.println("Percentage of upper case characters is: " + (lowerCaseCharacters * 100) / totalCharacters);

		// Percentage of digits
		double digitsCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i]))
				digitsCount++;
		}
		System.out.println("Percentage of digits is: " + (digitsCount * 100) / totalCharacters);

	}
}
