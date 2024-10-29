package interviewPracticeFour;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12345, value = 0;
		String str = String.valueOf(num);

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		value = Integer.valueOf(sb.toString());
		System.out.println(value);

	}
}
