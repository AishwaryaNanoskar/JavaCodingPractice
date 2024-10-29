package interviewPractice;

/*Write a Java program to reverse a string with preserving the
position of spaces. For example, if “I Am Not String” is the given 
string then the reverse of this string with preserving the position of 
spaces is “g ni rtS toNmAI”.*/
public class ProgramTwentyEight {

	public static void main(String[] args) {
		String input = "I Am Not String";

		char[] inpStr = input.toCharArray();

		char[] outStr = new char[inpStr.length];

		char[] resltStr = new char[outStr.length];

		int[] spaces = new int[inpStr.length];

		int spaceCount = 0;
		for (int j = 0; j < inpStr.length; j++) {
			if (inpStr[j] == ' ') {
				spaces[spaceCount] = j;
			}
			spaceCount++;
		}
//debugging code prints spaces
//		System.out.println("Spaces String: ");
//		for (int i = 0; i < spaces.length; i++) {
//			System.out.print("" + spaces[i]);
//		}
//		System.out.println("");

		int value = 0;
		for (int i = inpStr.length - 1; i >= 0; i--) {
			if (inpStr[i] != ' ') {
				outStr[value] = inpStr[i];
				value++;
			}
		}

		int k = 0;
		int m = 0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] == 0) {
				resltStr[k] = outStr[m];
				m++;
			}
			k++;
		}

		System.out.print("Output String: ");
		for (int i = 0; i < outStr.length; i++) {
			System.out.print("" + outStr[i]);
		}
		System.out.println("");
		System.out.print("Result string String: ");
		for (int i = 0; i < resltStr.length; i++) {
			System.out.print("" + resltStr[i]);
		}
	}

}
