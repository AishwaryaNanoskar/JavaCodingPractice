package streamsPracticeTwo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		String strOne = "Triangle i";
		String strTwo = "Integral i";

		String str1 = Stream.of(strOne.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		String str2 = Stream.of(strTwo.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		System.out.println("" + str1 + "\n" + str2);
		if (str1.equals(str2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
