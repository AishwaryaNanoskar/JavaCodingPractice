package Collections;

public class ReverseWordsInASentence {
	public static void main(String[] args) {
		String str = "Aishwarya is a girl";

		String s[] = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = s.length - 1; i >= 0; i--) {
			sb.append(s[i] + " ");
		}
		System.out.println(sb.toString());
	}
}
