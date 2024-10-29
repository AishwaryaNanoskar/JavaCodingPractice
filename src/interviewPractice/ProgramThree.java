package interviewPractice;

public class ProgramThree {

	public static void main(String[] args) {

		String str = "Aish  is a girl";

		StringBuilder strRemoveWhiteSpace = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				strRemoveWhiteSpace.append(ch);
			}
		}
		System.out.println(strRemoveWhiteSpace);
	}

}
