package interviewPracticeOne;

public class CheckNumbers {

	public static void main(String[] args) {
		
		int num = 97;

		String str = String.valueOf(num);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '7') {
				break;
			} else {
				count++;
				continue;
			}
		}
		if (count == str.length())
			System.out.println("There is no 7");
		else
			System.out.println("7 is present");

	}

}
