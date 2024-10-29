package interviewPractice;

import java.util.HashMap;
import java.util.Map;

/*Write a Java program to check whether two given strings are anagram or not. 
 * Two strings are said to be anagram if they contain same set of characters but in different order. 
 * For example, “Mother In Law” and “Hitler Woman” are anagrams. This type of Java programming 
 * questions test the coding skills of a candidate.
*/
public class ProgramSix {

	public static void main(String[] args) {
		String strOne = "Mother In Law";

		String strOneArrayList = strOne.replaceAll("\\s", "");

		char[] strOneArray = strOneArrayList.toUpperCase().toCharArray();

		String strTwo = "Hitler Woman";

//		String strTwo = "Maz Woman";

		String strTwoArrayList = strTwo.replaceAll("\\s", "");

		char[] strTwoArray = strTwoArrayList.toUpperCase().toCharArray();

		Map<Character, Integer> mapArray = new HashMap<Character, Integer>();

		System.out.println("String one length" + strOne.length());

		System.out.println("String two length" + strTwo.length());

		for (char value : strOneArray) {
			if (mapArray.containsKey(value)) {
				mapArray.put(value, mapArray.get(value) + 1);
			} else {
				mapArray.put(value, 1);
			}
		}

		System.out.println("" + mapArray);

		boolean checkValue = true;
		for (char valueTwo : strTwoArray) {
			if (mapArray.containsKey(valueTwo)) {
				if (mapArray.get(valueTwo).equals(1)) {
					checkValue = true;
				} else {
					checkValue = false;
					break;
				}
			} else {
				checkValue = false;
				break;
			}
		}

		System.out.println("" + checkValue);

		if (checkValue)
			System.out.println("The Strings are anagrams");
		else
			System.out.println("The Strings are not anagrams");

	}

}
