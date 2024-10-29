package interviewPractice;

public class LeetCodeValidPatrenthisis {
	public static void main(String ar[]) {
		String s = "()";
		isValid(s);
	}

	public static boolean isValid(String s) {
		int len = s.length();

		String openPar[] = { "(", "{", "[" };

		String closePar[] = { ")", "}", "]" };

		boolean check = false;
//		System.out.println(""+s.length());
		for (int i = 0; i < len; i++) {
			int j = 0;
			System.out.println("" + s.charAt(i));
			System.out.println("" + s.charAt(j));
			if (s.charAt(i) == openPar[j].charAt(j)) {
				check = true;

			}

			if (check) {

			}
		}
		return check;
	}
}
