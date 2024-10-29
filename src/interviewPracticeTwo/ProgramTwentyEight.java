package interviewPracticeTwo;

public class ProgramTwentyEight {
	public static void main(String[] args) { 

		String str = "I Am Not String";

		char arr[] = new char[str.replaceAll("\\s", "").length()];

		int emptySpace[] = new int[str.length()];

		// Integer array to store empty spaces
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				emptySpace[i] = 1;
			}
		}

		// Character array to store the reverse string
		int k = arr.length - 1;
		for (Character d : str.replaceAll("\\s", "").toCharArray()) {
			if (!Character.isWhitespace(d) && k >= 0) {
				arr[k] = d;
				k--;
			}
		}

		// Create the final string with spaces in correct positions
		int j = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < emptySpace.length; i++) {
			if (!(emptySpace[i] == 1)) {
				sb.append(arr[j]);
				j++;
			} else {
				sb.append(' ');
			}
		}
		System.out.println(sb);
	}
}
