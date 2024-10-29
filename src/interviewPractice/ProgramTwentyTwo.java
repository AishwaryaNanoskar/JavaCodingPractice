package interviewPractice;

import java.util.ArrayList;
import java.util.stream.Stream;

/*Write a Java program to reverse each word of a given string. For example, 
If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”.
*/
public class ProgramTwentyTwo {

	public static void main(String[] args) {
		String input = "Java Concept Of The Day";

		char reverse[] = input.toCharArray();

		char newReverse[] = new char[reverse.length];

		int j = 0;
		for (int i = reverse.length - 1; i >= 0; i--) {
			newReverse[j] = reverse[i];
			j++;
		}
		String str[] = String.valueOf(newReverse).split(" ");

		ArrayList<String> reverseString = new ArrayList<String>();

		for (int i = str.length - 1; i >= 0; i--) {
			reverseString.add(str[i]);
		}
		
		StringBuilder arrToString = new StringBuilder();
		for(int i=0;i<reverseString.size();i++) {
			arrToString.append(reverseString.get(i));
			arrToString.append(" ");
		
		}
		
		System.out.println(arrToString);
		
	}

}
