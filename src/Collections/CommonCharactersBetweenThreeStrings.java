package Collections;

public class CommonCharactersBetweenThreeStrings {
	public static void main(String[] args) {

		String str1 = "aishwry";

		String str2 = "ashi";

		String str3 = "ai";

		for (char c : str1.toCharArray()) {
			if (str1.indexOf(c) != -1 && str2.indexOf(c) != -1 && str3.indexOf(c) != -1)
				System.out.println(c);
		}

	}
}
