package kpibi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProgramSix {

	public static void main(String[] args) {

		String str1 = "Mother In Lawk";

		String str2 = "Hitler Woman";

		char str1Char[] = str1.toLowerCase().replaceAll("\\s", "").toCharArray();

		char str2Char[] = str2.toLowerCase().replaceAll("\\s", "").toCharArray();

		Map<Character, Integer> dataOne = new HashMap<Character, Integer>();

		for (char s1 : str1Char) {
			if (dataOne.containsKey(s1)) {
				dataOne.put(s1, dataOne.get(s1) + 1);
			} else {
				dataOne.put(s1, 1);
			}
		}

		boolean isAnagram = false;
		for (char s2 : str2Char) {
			if (!dataOne.containsKey(s2)) {
				isAnagram = true;
			}
		}

		if (!isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");

		}

	}

}
