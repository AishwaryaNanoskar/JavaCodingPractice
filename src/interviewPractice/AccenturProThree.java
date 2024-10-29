package interviewPractice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AccenturProThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries = "India,Srilanka,Pakistan,Europe,Australia,Pakistan";

		String[] countryArray = countries.split(",");

		Set<String> sortedCountry = new HashSet<String>();

		System.out.print("Total number of countries are: ");
		System.out.print(countryArray.length - 1 + "\n");

		for (String data : countryArray) {
			sortedCountry.add(data);
		}

		// List to add sorted data
		List<String> newData = sortedCountry.stream().sorted().collect(Collectors.toList());
		System.out.println("Distinct countries are: " + newData);

	}

}
