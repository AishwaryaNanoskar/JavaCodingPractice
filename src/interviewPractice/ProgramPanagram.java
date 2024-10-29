package interviewPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Given a string Str. The task is to check if it is Pangram or not. A Pangram is a sentence containing every letter in the English Alphabet. 
 * Examples: Input: “The quick brown fox jumps over the lazy dog” Output: is a Pangram Explanation: Contains all the characters from ‘a’ to ‘z’]
*/
public class ProgramPanagram {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";

		str = str.toLowerCase().replaceAll("\s", "");
		String regex = "[@_!#$%^&*()<>?/|}{~:]";

		boolean check = true;

		for (char c = 'a'; c <= 'z'; c++) {
			if (!str.contains(String.valueOf(c))) {
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println("String contains all the alphabets");
		} else {
			System.out.println("String does not contains all the alphabets");
		}

	}

}
