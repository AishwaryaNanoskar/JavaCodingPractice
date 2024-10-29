package interviewPractice;

public class CheckVowel {

	public static void main(String[] args) {
		System.out.println("" + checkVowel("sh"));
	}

	public static boolean checkVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
