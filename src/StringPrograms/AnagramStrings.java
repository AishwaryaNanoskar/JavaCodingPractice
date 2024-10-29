package StringPrograms;

public class AnagramStrings {
	public static void main(String[] args) {
		String str1 = "heart";

		String str2 = "earth";

		boolean check = true;
		if (str1.length() != str2.length())
			check = false;
		else {
			for (int i = 0; i < str1.length(); i++) {
				int j = 0, count = 0;
				while (j < str2.length()) {
					if (str1.charAt(i) == str2.charAt(j)) {
						break;
					} else {
						//Count check is added so when the character in string 1 which is not present in 
						//string 2 it will keep checking until the length of the complete string 2 is completed
						count++;
						j++;
					}
				}
				if (count == str1.length())
					check = false;
				else
					check = true;
			}
		}
		if(!check) 
			System.out.println("String is not Anagram");
		else 
			System.out.println("String is Anagram");


	}
}
