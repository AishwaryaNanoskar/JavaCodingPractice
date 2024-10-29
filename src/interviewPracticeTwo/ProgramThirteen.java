package interviewPracticeTwo;

public class ProgramThirteen {
	public static void main(String[] args) {
		int num = 145, replace = 0;
		String target = "4";

		while (num != 0) {
			String str = String.valueOf(num);
			if (!str.contains(target)) {
				replace = Integer.valueOf(str);
				break;
			}
			num--;

		}
		System.out.println("The number less than " + num + " which doesn't contain " + target + " is: " + replace);
	}
}
