package streamsPracticeTwo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAString {
	public static void main(String[] args) {
		String str = "Aishwarya is a girl";

		String rev = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println("The string reverse is: " + rev);
	}
}
