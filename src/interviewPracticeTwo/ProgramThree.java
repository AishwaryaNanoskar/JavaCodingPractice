package interviewPracticeTwo;

public class ProgramThree {
	public static void main(String[] args) {
		String str = "I am a girl";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println("String without space is: " + sb.toString());
	}
}
