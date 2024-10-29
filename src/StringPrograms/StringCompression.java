package StringPrograms;

public class StringCompression {

	public static void main(String[] args) {

		String str = "aabcccccaaa";

		int charCount = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1 && (str.charAt(i) == str.charAt(i + 1))) {
				charCount++;
			} else {
				System.out.println(str.charAt(i) + ": " + charCount);
				charCount = 1;

			}
		}
	}

}
