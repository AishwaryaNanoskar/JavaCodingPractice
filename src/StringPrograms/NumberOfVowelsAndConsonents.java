package StringPrograms;

public class NumberOfVowelsAndConsonents {
	public static void main(String[] args) {
		String str = "Aishwarya";

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		int vowelCount = 0, consonentCount = 0;
		for (int i = 0; i < str.length(); i++) {
			int totalCount = 0;
			for (int j = 0; j < vowels.length; j++) {
				if (str.toLowerCase().charAt(i) == vowels[j]) {
					totalCount++;
					break;
				}
			}
			if ((totalCount != vowels.length) && (totalCount != 0))
				vowelCount++;
			else
				consonentCount++;
		}
		System.out.println("Vowel count is: " + vowelCount + " Consonent count is: " + consonentCount);

	}
}
