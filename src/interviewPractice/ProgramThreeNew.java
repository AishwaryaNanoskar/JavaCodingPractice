package interviewPractice;

public class ProgramThreeNew {

	public static void main(String[] args) {
		String str = "Enter input string to be cleaned from white spaces…!";

		char[] c = str.toCharArray();

		StringBuilder strNew = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			char nt = str.charAt(i);
			if (!Character.isWhitespace(nt)) {
				strNew.append(nt);
			}
		}

		System.out.println(strNew);
	}

}
