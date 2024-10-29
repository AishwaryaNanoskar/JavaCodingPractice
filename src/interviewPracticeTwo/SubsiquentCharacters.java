package interviewPracticeTwo;

public class SubsiquentCharacters {
	public static void main(String[] args) {
		String str = "abbbaacccc";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				System.out.println(str.charAt(i) + " = " + count);
				count = 1;
			}
		}

	}
}
