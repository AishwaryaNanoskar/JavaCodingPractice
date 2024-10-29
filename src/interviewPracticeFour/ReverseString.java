package interviewPracticeFour;

public class ReverseString {
	public static void main(String[] args) {
		String str = "I love Java    Programming";

		String array[] = str.split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			for (int j = array[i].length() - 1; j >= 0; j--) {

				// Condition to fetch the character of the elements of the array
				sb.append(array[i].charAt(j));
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
