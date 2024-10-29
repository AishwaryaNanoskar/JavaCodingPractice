package interviewPractice;

/*How to reverse a string in Java?*/

public class ProgramOne {

	public static void main(String[] args) {
		String str = "Aishwarya";

		char c[] = str.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = c.length - 1; i >= 0; i--) {
			sb.append(c[i]);
		}

		System.out.println("Reverse String is: " + sb);
	}

}
