package kpibi;

public class ProgramThree {

	public static void main(String[] args) {
		String str = "I am a girl named Aishwarya";

		char a[] = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (char c : a) {
			if (!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
