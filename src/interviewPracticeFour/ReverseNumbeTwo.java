package interviewPracticeFour;

public class ReverseNumbeTwo {
	public static void main(String[] args) {
		int num = 1234567;

		String str = String.valueOf(num);

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.print(Integer.parseInt(sb.toString()));

	}
}
