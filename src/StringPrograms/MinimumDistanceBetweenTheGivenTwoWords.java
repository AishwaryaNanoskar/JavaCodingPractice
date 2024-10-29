package StringPrograms;

public class MinimumDistanceBetweenTheGivenTwoWords {
	public static void main(String[] args) {
		String str[] = { "the", "quick", "the", "fox", "quick" }, word1 = "the", word2 = "fox";

		int indexFirstWord = 0, indexSecondWord = 0;

		int j = 0;
		for (String compare : str) {
			if (word1.equalsIgnoreCase(compare)) {
				indexFirstWord = j;
			}
			j++;
		}

		int i = 0;
		for (String compare : str) {
			if (word2.equalsIgnoreCase(compare)) {
				indexSecondWord = i;
			}
			i++;
		}

		System.out.println("The length between two words is: " + (indexSecondWord - indexFirstWord));
	}

}
