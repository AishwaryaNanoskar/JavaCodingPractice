package streamsPracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffixDelimeter {

	public static void main(String[] args) {

		List<String> inpString = Arrays.asList("Aishwarya", "Mitali", "Papa", "Mummy");
//		Collectors.joining("Delimeter", "Preffix", "Suffix")
		String inpStringMapped = inpString.stream().collect(Collectors.joining(".", "-", ";"));
		System.out.println("Strings joined using Prefix Suffix Delimeter: " + inpStringMapped);
	}

}
