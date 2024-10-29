package interviewPracticeOne;

public class ReverseWordsInString {

	public static String revereStringWords(String str) {
		String strArr[] = str.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = strArr.length - 1; i >= 0; i--) {
			sb.append(strArr[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Welcome to Java World";
		System.out.println(revereStringWords(str));

	}
}
