package StringPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Aishwary";

		char c[] = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (int i = c.length - 1; i >= 0; i--) {
			sb.append(c[i]);
		}
		System.out.println(sb);
	}
}
