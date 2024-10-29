package interviewPracticeTwo;

public class ProgramTwentyTwo {
	public static void main(String[] args) {
		String str = "Java Concept Of The Day";

		String strNew[] = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < strNew.length; i++) {
			for (int j = strNew[i].length() - 1; j >= 0; j--) {
				sb.append(strNew[i].charAt(j));
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
